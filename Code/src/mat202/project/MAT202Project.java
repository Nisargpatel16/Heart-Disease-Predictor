/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mat202.project;


import java.util.*;


public class MAT202Project {
static float probObesity(float vectExcDiet[],float Obesity[]){
 float ans = 0;
    for (int i = 0; i < 4; i++) {
        ans = ans + Obesity[i]*vectExcDiet[i]; 
    }
    return ans;
}    
 static float probATS(float answerSLDL1[],float answerSTRIG1[],float Exc[],float answerCHDLR1[],float ATS[]){
  float answerATS = 0;
    int cnt = 0;
    for(int i = 1 ; i >= 0 ; i--){
	    for(int j = 1 ; j >= 0 ; j--){
	        for(int k = 0 ; k < 2 ; k++){
	            for(int l = 1 ; l >= 0 ; l--){
	                //cout << answerSLDL1[i] << " " << answerSTRIG1[j] << " " << Exc[k] << " " << answerCHDLR1[l] << " " << ATS[cnt] << "\n";
	                answerATS = answerATS + answerSLDL1[i]*answerSTRIG1[j]*Exc[k]*answerCHDLR1[l]*ATS[cnt];
	                cnt++;
	            }
	        }
	    }
	}
	
	return answerATS;
 }
 static float probHBP(float MED[],float SMALC[],float Exc[],float answerObesity1[],float HBP[]){
    
    float answerHBP = 0;
    int cnt = 0;
    for(int i = 0 ; i < 2 ; i++){
	    for(int j = 1 ; j >= 0 ; j--){
	        for(int k = 0 ; k < 2 ; k++){
	            for(int l = 1 ; l >= 0 ; l--){
	                //cout << MED[i] << " " << SMALC[j] << " " << Exc[k] << " " << answerObesity1[l] << " " << HBP[cnt] << "\n";
	                answerHBP = answerHBP + MED[i]*SMALC[j]*Exc[k]*answerObesity1[l]*HBP[cnt];
	                cnt++;
	            }
	        }
	    }
	}
	return answerHBP;
}

static float probHD(float ATS1[],float SSM1[],float HBP1[],float FH[],float ADM[],float HD[]){
    
    float answerHD = 0;
    int cnt = 0;
    for(int i = 1 ; i >= 0 ; i--){
	    for(int j = 0 ; j < 2 ; j++){
	        for(int k = 1 ; k >= 0 ; k--){
	            for(int l = 1 ; l >= 0 ; l--){
	                for(int z = 1 ; z >= 0 ; z--){
	                    //cout << ATS1[i] << " " << SSM1[j] << " " << HBP1[k] << " " << FH[l] << " " << ADM[z] << " "<< HD[cnt] << "\n";
	                    answerHD = answerHD + ATS1[i]*SSM1[j]*HBP1[k]*FH[l]*ADM[z]*HD[cnt];
	                    cnt++;
	                }
	            }
	        }
	    }
	}
	return answerHD;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vectExcDiet[] = new float[4];
       float Obesity[] = {0.6f,0.1f,0.1f,0.05f};
       //float NegObesity[] = {0.4,0.9,0.9,0.95};
       float ATS[] = {0.84f,0.83f,0.83f,0.81f,0.61f,0.57f,0.57f,0.52f,0.74f,0.71f,0.71f,0.68f,0.35f,0.28f,0.28f,0.20f};
       float HBP[] = {0.92f,0.87f,0.85f,0.79f,0.76f,0.70f,0.58f,0.52f,0.58f,0.52f,0.40f,0.34f,0.31f,0.25f,0.13f,0.07f};
       float HD[] = {0.94f,0.93f,0.92f,0.91f,0.84f,0.82f,0.80f,0.78f,0.91f,0.91f,0.90f,0.89f,0.80f,0.78f,0.76f,0.73f,0.79f,0.77f,0.74f,0.71f,0.48f,0.42f,0.35f,0.28f,0.74f,0.71f,0.68f,0.64f,0.35f,0.28f,0.19f,0.10f};
       float answerObesity = 0;
       float answerSLDL = 0;
       float answerSTRIG = 0;
       float answerCHDLR = 0;
       float answerATS = 0;
       float answerHBP = 0;
       float answerSSM = 0;
       float answerHD = 0;
       float answerECG = 0;
       float answerANGP = 0;
       float answerMIOCAR = 0;
       float answerRHB = 0;
    
    
    
    float Diet[] = new float[2];                  // 0 -> bad , 1 -> good for all
    float Exc[] = new float[2];                   // 0 -> bad , 1 -> good
    float SLDL[]= new float[2];
    float STRIG[]= new float[2];
    float CHDLR[]= new float[2];
    float SSM[]= new float[2];
    float MED[]= new float[2];
    float SMALC[]= new float[2];
    float FH[]= new float[2];
    float ADM[]= new float[2];
    float ECG[]= new float[2];
    float ANGP[]= new float[2];
    float MIOCAR[]= new float[2];
    float RHB[]= new float[2];
    
    float answerObesity1[]= new float[2];
    float answerSLDL1[]= new float[2];
    float answerSTRIG1[]= new float[2];
    float answerCHDLR1[]= new float[2];
    float answerSSM1[]= new float[2];
    float answerHBP1[]= new float[2];
    float answerATS1[]= new float[2];
    float answerHD1[]= new float[2];
    
    SLDL[1] = 0.25f;
    SLDL[0] = 0.75f;
    
    STRIG[1] = 0.30f;
    STRIG[0] = 0.70f;
    
    CHDLR[1] = 0.25f;
    CHDLR[0] = 0.75f;
    
    SSM[1] = 0.30f;
    SSM[0] = 0.70f;
    
    ECG[1] = 0.95f;
    ECG[0] = 0.05f;
    
    ANGP[1] = 0.85f;
    ANGP[0] = 0.15f;
    
    MIOCAR[1] = 0.90f;
    MIOCAR[0] = 0.10f;
    
    RHB[1] = 0.99f;
    RHB[0] = 0.01f;
    
    System.out.println("Enter : ");
    MED[1] = input.nextFloat();
    MED[0] = 1 - MED[1];
    System.out.println("Enter : ");
    SMALC[1] = input.nextFloat();
    SMALC[0] = 1 - SMALC[1];
    
    System.out.println("Enter : ");
    FH[1] = input.nextFloat();
    FH[0] = 1 - FH[1];
    System.out.println("Enter : ");
    ADM[1] = input.nextFloat();
    ADM[0] = 1 - ADM[1];
    
    System.out.println("Enter : ");
    Diet[1] = input.nextFloat();
    Diet[0] = 1 - Diet[1];
    System.out.println("Enter : ");
    Exc[1] = input.nextFloat();
    Exc[0] = 1 - Exc[1];
    vectExcDiet[0] = Exc[0]*Diet[0];
    vectExcDiet[1] = Exc[0]*Diet[1];
    vectExcDiet[2] = Exc[1]*Diet[0];
    vectExcDiet[3] = Exc[1]*Diet[1];
    
        for (int m = 0; m < 2; m++) {
         answerSLDL = answerSLDL + Diet[m]*SLDL[m];
        //cout << Diet[i] << " " << STRIG[i] << "\n";
        answerSTRIG = answerSTRIG + Diet[m]*STRIG[m];
        answerCHDLR = answerCHDLR + Diet[m]*CHDLR[m];
        //cout << "Hiii";
        //cout << Diet[i]*SSM[i] << "\n";
        answerSSM = answerSSM + Diet[m]*SSM[m];
        }
        
        answerSLDL1[0] = 1 - answerSLDL;
	answerSLDL1[1] = answerSLDL;
	answerSTRIG1[0] = 1 - answerSTRIG;
	answerSTRIG1[1] = answerSTRIG;
	answerCHDLR1[0] = 1 - answerCHDLR;
	//cout << answerCHDLR1[0] << "\n\n\n";
	answerCHDLR1[1] = answerCHDLR;
	answerSSM1[1] = 1 - answerSSM;
	answerSSM1[0] = answerSSM;
        
        answerATS = probATS(answerSLDL1,answerSTRIG1,Exc,answerCHDLR1,ATS);
	answerATS1[0] = 1 - answerATS;
	answerATS1[1] = answerATS;
	//cout << "ATS : " << answerATS << "\n";
	
	// Table6
	answerObesity = probObesity(vectExcDiet,Obesity);
	answerObesity1[0] = 1 - answerObesity;
	answerObesity1[1] = answerObesity;
	//cout << "Obesity : " << answerObesity << "\n";
	
	
	// Table2
	answerHBP = probHBP(MED,SMALC,Exc,answerObesity1,HBP);
	answerHBP1[0] = 1 - answerHBP;
	answerHBP1[1] = answerHBP;
	//cout << "HBP : " << answerHBP << "\n";
	
	// Table1
	answerHD = probHD(answerATS1,answerSSM1,answerHBP1,FH,ADM,HD);
	answerHD1[0] = 1 - answerHD;
	answerHD1[1] = answerHD;
    
        for (int m = 0; m < 2; m++) {
            	//cout << answerHD1[j] << " " << RHB[j] << "\n";
		answerECG = answerECG + answerHD1[m]*ECG[m];
		//cout << answerHD1[j] << " " << ANGP[j] << "\n";
		answerANGP = answerANGP + answerHD1[m]*ANGP[m];
		answerMIOCAR = answerMIOCAR + answerHD1[m]*MIOCAR[m];
		answerRHB = answerRHB + answerHD1[m]*RHB[m];
        }
        
        System.out.println("Chances of Heart Disease is : "+answerHD*100+"% \n");
        System.out.println("Possibility of ECG : "+answerECG*100 +" % \n");
        System.out.println("Possibility of Angina Pectrosis : "+answerANGP*100+"% \n");
        System.out.println("Possibility of Miocardial Infraction : "+answerMIOCAR*100+"% \n");
        System.out.println("Possibility of Rapid Heartbeats : "+answerRHB*100+"% \n");
        
        
        
        float s1= answerHD*100;
        float s2= answerECG*100;
        float s3= answerANGP*100;
        float s4= answerMIOCAR*100;
        float s5= answerRHB*100;
        
        
    }
}
