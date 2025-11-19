package org.example.evms.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.evms.services.EvmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvmsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'evenement'", "'{'", "'titre'", "'description'", "'debut'", "'fin'", "'lieu'", "'organisateur'", "'inscriptions'", "'}'", "'notifications'", "'nom'", "'adresse'", "'capacite'", "'utilisateur'", "'email'", "'role'", "'participant'", "'admin'", "'motDePasse'", "'inscription'", "'notification'", "'message'", "'destinataire'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DATE=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEvmsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvmsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvmsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvms.g"; }



     	private EvmsGrammarAccess grammarAccess;

        public InternalEvmsParser(TokenStream input, EvmsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EvmsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEvms.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEvms.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEvms.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEvms.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleRootElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalEvms.g:77:2: ( ( (lv_elements_0_0= ruleRootElement ) )* )
            // InternalEvms.g:78:2: ( (lv_elements_0_0= ruleRootElement ) )*
            {
            // InternalEvms.g:78:2: ( (lv_elements_0_0= ruleRootElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==18||LA1_0==26||(LA1_0>=32 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvms.g:79:3: (lv_elements_0_0= ruleRootElement )
            	    {
            	    // InternalEvms.g:79:3: (lv_elements_0_0= ruleRootElement )
            	    // InternalEvms.g:80:4: lv_elements_0_0= ruleRootElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsRootElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleRootElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.example.evms.Evms.RootElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRootElement"
    // InternalEvms.g:100:1: entryRuleRootElement returns [EObject current=null] : iv_ruleRootElement= ruleRootElement EOF ;
    public final EObject entryRuleRootElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElement = null;


        try {
            // InternalEvms.g:100:52: (iv_ruleRootElement= ruleRootElement EOF )
            // InternalEvms.g:101:2: iv_ruleRootElement= ruleRootElement EOF
            {
             newCompositeNode(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootElement=ruleRootElement();

            state._fsp--;

             current =iv_ruleRootElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // InternalEvms.g:107:1: ruleRootElement returns [EObject current=null] : (this_Evenement_0= ruleEvenement | this_Lieu_1= ruleLieu | this_Utilisateur_2= ruleUtilisateur | this_Inscription_3= ruleInscription | this_Notification_4= ruleNotification ) ;
    public final EObject ruleRootElement() throws RecognitionException {
        EObject current = null;

        EObject this_Evenement_0 = null;

        EObject this_Lieu_1 = null;

        EObject this_Utilisateur_2 = null;

        EObject this_Inscription_3 = null;

        EObject this_Notification_4 = null;



        	enterRule();

        try {
            // InternalEvms.g:113:2: ( (this_Evenement_0= ruleEvenement | this_Lieu_1= ruleLieu | this_Utilisateur_2= ruleUtilisateur | this_Inscription_3= ruleInscription | this_Notification_4= ruleNotification ) )
            // InternalEvms.g:114:2: (this_Evenement_0= ruleEvenement | this_Lieu_1= ruleLieu | this_Utilisateur_2= ruleUtilisateur | this_Inscription_3= ruleInscription | this_Notification_4= ruleNotification )
            {
            // InternalEvms.g:114:2: (this_Evenement_0= ruleEvenement | this_Lieu_1= ruleLieu | this_Utilisateur_2= ruleUtilisateur | this_Inscription_3= ruleInscription | this_Notification_4= ruleNotification )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 33:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEvms.g:115:3: this_Evenement_0= ruleEvenement
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getEvenementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Evenement_0=ruleEvenement();

                    state._fsp--;


                    			current = this_Evenement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvms.g:124:3: this_Lieu_1= ruleLieu
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getLieuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lieu_1=ruleLieu();

                    state._fsp--;


                    			current = this_Lieu_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEvms.g:133:3: this_Utilisateur_2= ruleUtilisateur
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getUtilisateurParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Utilisateur_2=ruleUtilisateur();

                    state._fsp--;


                    			current = this_Utilisateur_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEvms.g:142:3: this_Inscription_3= ruleInscription
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getInscriptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inscription_3=ruleInscription();

                    state._fsp--;


                    			current = this_Inscription_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEvms.g:151:3: this_Notification_4= ruleNotification
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getNotificationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Notification_4=ruleNotification();

                    state._fsp--;


                    			current = this_Notification_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleEvenement"
    // InternalEvms.g:163:1: entryRuleEvenement returns [EObject current=null] : iv_ruleEvenement= ruleEvenement EOF ;
    public final EObject entryRuleEvenement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvenement = null;


        try {
            // InternalEvms.g:163:50: (iv_ruleEvenement= ruleEvenement EOF )
            // InternalEvms.g:164:2: iv_ruleEvenement= ruleEvenement EOF
            {
             newCompositeNode(grammarAccess.getEvenementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvenement=ruleEvenement();

            state._fsp--;

             current =iv_ruleEvenement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvenement"


    // $ANTLR start "ruleEvenement"
    // InternalEvms.g:170:1: ruleEvenement returns [EObject current=null] : (otherlv_0= 'evenement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'debut' ( (lv_dateDebut_8_0= RULE_DATE ) ) )? (otherlv_9= 'fin' ( (lv_dateFin_10_0= RULE_DATE ) ) )? otherlv_11= 'lieu' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'organisateur' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'inscriptions' otherlv_16= '{' ( (lv_inscriptions_17_0= ruleInscription ) )* otherlv_18= '}' )? (otherlv_19= 'notifications' otherlv_20= '{' ( (lv_notifications_21_0= ruleNotification ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleEvenement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_titre_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_dateDebut_8_0=null;
        Token otherlv_9=null;
        Token lv_dateFin_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_inscriptions_17_0 = null;

        EObject lv_notifications_21_0 = null;



        	enterRule();

        try {
            // InternalEvms.g:176:2: ( (otherlv_0= 'evenement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'debut' ( (lv_dateDebut_8_0= RULE_DATE ) ) )? (otherlv_9= 'fin' ( (lv_dateFin_10_0= RULE_DATE ) ) )? otherlv_11= 'lieu' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'organisateur' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'inscriptions' otherlv_16= '{' ( (lv_inscriptions_17_0= ruleInscription ) )* otherlv_18= '}' )? (otherlv_19= 'notifications' otherlv_20= '{' ( (lv_notifications_21_0= ruleNotification ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalEvms.g:177:2: (otherlv_0= 'evenement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'debut' ( (lv_dateDebut_8_0= RULE_DATE ) ) )? (otherlv_9= 'fin' ( (lv_dateFin_10_0= RULE_DATE ) ) )? otherlv_11= 'lieu' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'organisateur' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'inscriptions' otherlv_16= '{' ( (lv_inscriptions_17_0= ruleInscription ) )* otherlv_18= '}' )? (otherlv_19= 'notifications' otherlv_20= '{' ( (lv_notifications_21_0= ruleNotification ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalEvms.g:177:2: (otherlv_0= 'evenement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'debut' ( (lv_dateDebut_8_0= RULE_DATE ) ) )? (otherlv_9= 'fin' ( (lv_dateFin_10_0= RULE_DATE ) ) )? otherlv_11= 'lieu' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'organisateur' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'inscriptions' otherlv_16= '{' ( (lv_inscriptions_17_0= ruleInscription ) )* otherlv_18= '}' )? (otherlv_19= 'notifications' otherlv_20= '{' ( (lv_notifications_21_0= ruleNotification ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalEvms.g:178:3: otherlv_0= 'evenement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'debut' ( (lv_dateDebut_8_0= RULE_DATE ) ) )? (otherlv_9= 'fin' ( (lv_dateFin_10_0= RULE_DATE ) ) )? otherlv_11= 'lieu' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'organisateur' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'inscriptions' otherlv_16= '{' ( (lv_inscriptions_17_0= ruleInscription ) )* otherlv_18= '}' )? (otherlv_19= 'notifications' otherlv_20= '{' ( (lv_notifications_21_0= ruleNotification ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvenementAccess().getEvenementKeyword_0());
            		
            // InternalEvms.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvms.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvms.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalEvms.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvenementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvenementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEvenementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEvms.g:204:3: (otherlv_3= 'titre' ( (lv_titre_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvms.g:205:4: otherlv_3= 'titre' ( (lv_titre_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvenementAccess().getTitreKeyword_3_0());
                    			
                    // InternalEvms.g:209:4: ( (lv_titre_4_0= RULE_STRING ) )
                    // InternalEvms.g:210:5: (lv_titre_4_0= RULE_STRING )
                    {
                    // InternalEvms.g:210:5: (lv_titre_4_0= RULE_STRING )
                    // InternalEvms.g:211:6: lv_titre_4_0= RULE_STRING
                    {
                    lv_titre_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_titre_4_0, grammarAccess.getEvenementAccess().getTitreSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvenementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"titre",
                    							lv_titre_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEvms.g:228:3: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvms.g:229:4: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvenementAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalEvms.g:233:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalEvms.g:234:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalEvms.g:234:5: (lv_description_6_0= RULE_STRING )
                    // InternalEvms.g:235:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getEvenementAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvenementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEvms.g:252:3: (otherlv_7= 'debut' ( (lv_dateDebut_8_0= RULE_DATE ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvms.g:253:4: otherlv_7= 'debut' ( (lv_dateDebut_8_0= RULE_DATE ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvenementAccess().getDebutKeyword_5_0());
                    			
                    // InternalEvms.g:257:4: ( (lv_dateDebut_8_0= RULE_DATE ) )
                    // InternalEvms.g:258:5: (lv_dateDebut_8_0= RULE_DATE )
                    {
                    // InternalEvms.g:258:5: (lv_dateDebut_8_0= RULE_DATE )
                    // InternalEvms.g:259:6: lv_dateDebut_8_0= RULE_DATE
                    {
                    lv_dateDebut_8_0=(Token)match(input,RULE_DATE,FOLLOW_11); 

                    						newLeafNode(lv_dateDebut_8_0, grammarAccess.getEvenementAccess().getDateDebutDATETerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvenementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dateDebut",
                    							lv_dateDebut_8_0,
                    							"org.example.evms.Evms.DATE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEvms.g:276:3: (otherlv_9= 'fin' ( (lv_dateFin_10_0= RULE_DATE ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvms.g:277:4: otherlv_9= 'fin' ( (lv_dateFin_10_0= RULE_DATE ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getEvenementAccess().getFinKeyword_6_0());
                    			
                    // InternalEvms.g:281:4: ( (lv_dateFin_10_0= RULE_DATE ) )
                    // InternalEvms.g:282:5: (lv_dateFin_10_0= RULE_DATE )
                    {
                    // InternalEvms.g:282:5: (lv_dateFin_10_0= RULE_DATE )
                    // InternalEvms.g:283:6: lv_dateFin_10_0= RULE_DATE
                    {
                    lv_dateFin_10_0=(Token)match(input,RULE_DATE,FOLLOW_12); 

                    						newLeafNode(lv_dateFin_10_0, grammarAccess.getEvenementAccess().getDateFinDATETerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvenementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dateFin",
                    							lv_dateFin_10_0,
                    							"org.example.evms.Evms.DATE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getEvenementAccess().getLieuKeyword_7());
            		
            // InternalEvms.g:304:3: ( (otherlv_12= RULE_ID ) )
            // InternalEvms.g:305:4: (otherlv_12= RULE_ID )
            {
            // InternalEvms.g:305:4: (otherlv_12= RULE_ID )
            // InternalEvms.g:306:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvenementRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_12, grammarAccess.getEvenementAccess().getLieuLieuCrossReference_8_0());
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getEvenementAccess().getOrganisateurKeyword_9());
            		
            // InternalEvms.g:321:3: ( (otherlv_14= RULE_ID ) )
            // InternalEvms.g:322:4: (otherlv_14= RULE_ID )
            {
            // InternalEvms.g:322:4: (otherlv_14= RULE_ID )
            // InternalEvms.g:323:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvenementRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_14, grammarAccess.getEvenementAccess().getCreateurUtilisateurCrossReference_10_0());
            				

            }


            }

            // InternalEvms.g:334:3: (otherlv_15= 'inscriptions' otherlv_16= '{' ( (lv_inscriptions_17_0= ruleInscription ) )* otherlv_18= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEvms.g:335:4: otherlv_15= 'inscriptions' otherlv_16= '{' ( (lv_inscriptions_17_0= ruleInscription ) )* otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getEvenementAccess().getInscriptionsKeyword_11_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getEvenementAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalEvms.g:343:4: ( (lv_inscriptions_17_0= ruleInscription ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==32) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEvms.g:344:5: (lv_inscriptions_17_0= ruleInscription )
                    	    {
                    	    // InternalEvms.g:344:5: (lv_inscriptions_17_0= ruleInscription )
                    	    // InternalEvms.g:345:6: lv_inscriptions_17_0= ruleInscription
                    	    {

                    	    						newCompositeNode(grammarAccess.getEvenementAccess().getInscriptionsInscriptionParserRuleCall_11_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_inscriptions_17_0=ruleInscription();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEvenementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inscriptions",
                    	    							lv_inscriptions_17_0,
                    	    							"org.example.evms.Evms.Inscription");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getEvenementAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalEvms.g:367:3: (otherlv_19= 'notifications' otherlv_20= '{' ( (lv_notifications_21_0= ruleNotification ) )* otherlv_22= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEvms.g:368:4: otherlv_19= 'notifications' otherlv_20= '{' ( (lv_notifications_21_0= ruleNotification ) )* otherlv_22= '}'
                    {
                    otherlv_19=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_19, grammarAccess.getEvenementAccess().getNotificationsKeyword_12_0());
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getEvenementAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEvms.g:376:4: ( (lv_notifications_21_0= ruleNotification ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==33) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEvms.g:377:5: (lv_notifications_21_0= ruleNotification )
                    	    {
                    	    // InternalEvms.g:377:5: (lv_notifications_21_0= ruleNotification )
                    	    // InternalEvms.g:378:6: lv_notifications_21_0= ruleNotification
                    	    {

                    	    						newCompositeNode(grammarAccess.getEvenementAccess().getNotificationsNotificationParserRuleCall_12_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_notifications_21_0=ruleNotification();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEvenementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"notifications",
                    	    							lv_notifications_21_0,
                    	    							"org.example.evms.Evms.Notification");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getEvenementAccess().getRightCurlyBracketKeyword_12_3());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getEvenementAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvenement"


    // $ANTLR start "entryRuleLieu"
    // InternalEvms.g:408:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalEvms.g:408:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalEvms.g:409:2: iv_ruleLieu= ruleLieu EOF
            {
             newCompositeNode(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieu=ruleLieu();

            state._fsp--;

             current =iv_ruleLieu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalEvms.g:415:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) (otherlv_5= 'adresse' ( (lv_adresse_6_0= RULE_STRING ) ) )? (otherlv_7= 'capacite' ( (lv_capacite_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nom_4_0=null;
        Token otherlv_5=null;
        Token lv_adresse_6_0=null;
        Token otherlv_7=null;
        Token lv_capacite_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalEvms.g:421:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) (otherlv_5= 'adresse' ( (lv_adresse_6_0= RULE_STRING ) ) )? (otherlv_7= 'capacite' ( (lv_capacite_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // InternalEvms.g:422:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) (otherlv_5= 'adresse' ( (lv_adresse_6_0= RULE_STRING ) ) )? (otherlv_7= 'capacite' ( (lv_capacite_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // InternalEvms.g:422:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) (otherlv_5= 'adresse' ( (lv_adresse_6_0= RULE_STRING ) ) )? (otherlv_7= 'capacite' ( (lv_capacite_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // InternalEvms.g:423:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) (otherlv_5= 'adresse' ( (lv_adresse_6_0= RULE_STRING ) ) )? (otherlv_7= 'capacite' ( (lv_capacite_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalEvms.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvms.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvms.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalEvms.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getNomKeyword_3());
            		
            // InternalEvms.g:453:3: ( (lv_nom_4_0= RULE_STRING ) )
            // InternalEvms.g:454:4: (lv_nom_4_0= RULE_STRING )
            {
            // InternalEvms.g:454:4: (lv_nom_4_0= RULE_STRING )
            // InternalEvms.g:455:5: lv_nom_4_0= RULE_STRING
            {
            lv_nom_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_nom_4_0, grammarAccess.getLieuAccess().getNomSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalEvms.g:471:3: (otherlv_5= 'adresse' ( (lv_adresse_6_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEvms.g:472:4: otherlv_5= 'adresse' ( (lv_adresse_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getLieuAccess().getAdresseKeyword_5_0());
                    			
                    // InternalEvms.g:476:4: ( (lv_adresse_6_0= RULE_STRING ) )
                    // InternalEvms.g:477:5: (lv_adresse_6_0= RULE_STRING )
                    {
                    // InternalEvms.g:477:5: (lv_adresse_6_0= RULE_STRING )
                    // InternalEvms.g:478:6: lv_adresse_6_0= RULE_STRING
                    {
                    lv_adresse_6_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_adresse_6_0, grammarAccess.getLieuAccess().getAdresseSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLieuRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"adresse",
                    							lv_adresse_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEvms.g:495:3: (otherlv_7= 'capacite' ( (lv_capacite_8_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEvms.g:496:4: otherlv_7= 'capacite' ( (lv_capacite_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getCapaciteKeyword_6_0());
                    			
                    // InternalEvms.g:500:4: ( (lv_capacite_8_0= RULE_INT ) )
                    // InternalEvms.g:501:5: (lv_capacite_8_0= RULE_INT )
                    {
                    // InternalEvms.g:501:5: (lv_capacite_8_0= RULE_INT )
                    // InternalEvms.g:502:6: lv_capacite_8_0= RULE_INT
                    {
                    lv_capacite_8_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_capacite_8_0, grammarAccess.getLieuAccess().getCapaciteINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLieuRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"capacite",
                    							lv_capacite_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleUtilisateur"
    // InternalEvms.g:527:1: entryRuleUtilisateur returns [EObject current=null] : iv_ruleUtilisateur= ruleUtilisateur EOF ;
    public final EObject entryRuleUtilisateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtilisateur = null;


        try {
            // InternalEvms.g:527:52: (iv_ruleUtilisateur= ruleUtilisateur EOF )
            // InternalEvms.g:528:2: iv_ruleUtilisateur= ruleUtilisateur EOF
            {
             newCompositeNode(grammarAccess.getUtilisateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUtilisateur=ruleUtilisateur();

            state._fsp--;

             current =iv_ruleUtilisateur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUtilisateur"


    // $ANTLR start "ruleUtilisateur"
    // InternalEvms.g:534:1: ruleUtilisateur returns [EObject current=null] : (otherlv_0= 'utilisateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) otherlv_5= 'email' ( (lv_email_6_0= RULE_STRING ) ) (otherlv_7= 'role' ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) ) )? (otherlv_9= 'motDePasse' ( (lv_motDePasse_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleUtilisateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nom_4_0=null;
        Token otherlv_5=null;
        Token lv_email_6_0=null;
        Token otherlv_7=null;
        Token lv_role_8_1=null;
        Token lv_role_8_2=null;
        Token lv_role_8_3=null;
        Token otherlv_9=null;
        Token lv_motDePasse_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalEvms.g:540:2: ( (otherlv_0= 'utilisateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) otherlv_5= 'email' ( (lv_email_6_0= RULE_STRING ) ) (otherlv_7= 'role' ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) ) )? (otherlv_9= 'motDePasse' ( (lv_motDePasse_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // InternalEvms.g:541:2: (otherlv_0= 'utilisateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) otherlv_5= 'email' ( (lv_email_6_0= RULE_STRING ) ) (otherlv_7= 'role' ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) ) )? (otherlv_9= 'motDePasse' ( (lv_motDePasse_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // InternalEvms.g:541:2: (otherlv_0= 'utilisateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) otherlv_5= 'email' ( (lv_email_6_0= RULE_STRING ) ) (otherlv_7= 'role' ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) ) )? (otherlv_9= 'motDePasse' ( (lv_motDePasse_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // InternalEvms.g:542:3: otherlv_0= 'utilisateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_STRING ) ) otherlv_5= 'email' ( (lv_email_6_0= RULE_STRING ) ) (otherlv_7= 'role' ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) ) )? (otherlv_9= 'motDePasse' ( (lv_motDePasse_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUtilisateurAccess().getUtilisateurKeyword_0());
            		
            // InternalEvms.g:546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvms.g:547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvms.g:547:4: (lv_name_1_0= RULE_ID )
            // InternalEvms.g:548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUtilisateurAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUtilisateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getUtilisateurAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUtilisateurAccess().getNomKeyword_3());
            		
            // InternalEvms.g:572:3: ( (lv_nom_4_0= RULE_STRING ) )
            // InternalEvms.g:573:4: (lv_nom_4_0= RULE_STRING )
            {
            // InternalEvms.g:573:4: (lv_nom_4_0= RULE_STRING )
            // InternalEvms.g:574:5: lv_nom_4_0= RULE_STRING
            {
            lv_nom_4_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_nom_4_0, grammarAccess.getUtilisateurAccess().getNomSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUtilisateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUtilisateurAccess().getEmailKeyword_5());
            		
            // InternalEvms.g:594:3: ( (lv_email_6_0= RULE_STRING ) )
            // InternalEvms.g:595:4: (lv_email_6_0= RULE_STRING )
            {
            // InternalEvms.g:595:4: (lv_email_6_0= RULE_STRING )
            // InternalEvms.g:596:5: lv_email_6_0= RULE_STRING
            {
            lv_email_6_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_email_6_0, grammarAccess.getUtilisateurAccess().getEmailSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUtilisateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalEvms.g:612:3: (otherlv_7= 'role' ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEvms.g:613:4: otherlv_7= 'role' ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_7, grammarAccess.getUtilisateurAccess().getRoleKeyword_7_0());
                    			
                    // InternalEvms.g:617:4: ( ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) ) )
                    // InternalEvms.g:618:5: ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) )
                    {
                    // InternalEvms.g:618:5: ( (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' ) )
                    // InternalEvms.g:619:6: (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' )
                    {
                    // InternalEvms.g:619:6: (lv_role_8_1= 'organisateur' | lv_role_8_2= 'participant' | lv_role_8_3= 'admin' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt13=1;
                        }
                        break;
                    case 29:
                        {
                        alt13=2;
                        }
                        break;
                    case 30:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalEvms.g:620:7: lv_role_8_1= 'organisateur'
                            {
                            lv_role_8_1=(Token)match(input,19,FOLLOW_26); 

                            							newLeafNode(lv_role_8_1, grammarAccess.getUtilisateurAccess().getRoleOrganisateurKeyword_7_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUtilisateurRule());
                            							}
                            							setWithLastConsumed(current, "role", lv_role_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalEvms.g:631:7: lv_role_8_2= 'participant'
                            {
                            lv_role_8_2=(Token)match(input,29,FOLLOW_26); 

                            							newLeafNode(lv_role_8_2, grammarAccess.getUtilisateurAccess().getRoleParticipantKeyword_7_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUtilisateurRule());
                            							}
                            							setWithLastConsumed(current, "role", lv_role_8_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalEvms.g:642:7: lv_role_8_3= 'admin'
                            {
                            lv_role_8_3=(Token)match(input,30,FOLLOW_26); 

                            							newLeafNode(lv_role_8_3, grammarAccess.getUtilisateurAccess().getRoleAdminKeyword_7_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUtilisateurRule());
                            							}
                            							setWithLastConsumed(current, "role", lv_role_8_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalEvms.g:656:3: (otherlv_9= 'motDePasse' ( (lv_motDePasse_10_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEvms.g:657:4: otherlv_9= 'motDePasse' ( (lv_motDePasse_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getUtilisateurAccess().getMotDePasseKeyword_8_0());
                    			
                    // InternalEvms.g:661:4: ( (lv_motDePasse_10_0= RULE_STRING ) )
                    // InternalEvms.g:662:5: (lv_motDePasse_10_0= RULE_STRING )
                    {
                    // InternalEvms.g:662:5: (lv_motDePasse_10_0= RULE_STRING )
                    // InternalEvms.g:663:6: lv_motDePasse_10_0= RULE_STRING
                    {
                    lv_motDePasse_10_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_motDePasse_10_0, grammarAccess.getUtilisateurAccess().getMotDePasseSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUtilisateurRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"motDePasse",
                    							lv_motDePasse_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getUtilisateurAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUtilisateur"


    // $ANTLR start "entryRuleInscription"
    // InternalEvms.g:688:1: entryRuleInscription returns [EObject current=null] : iv_ruleInscription= ruleInscription EOF ;
    public final EObject entryRuleInscription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInscription = null;


        try {
            // InternalEvms.g:688:52: (iv_ruleInscription= ruleInscription EOF )
            // InternalEvms.g:689:2: iv_ruleInscription= ruleInscription EOF
            {
             newCompositeNode(grammarAccess.getInscriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInscription=ruleInscription();

            state._fsp--;

             current =iv_ruleInscription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInscription"


    // $ANTLR start "ruleInscription"
    // InternalEvms.g:695:1: ruleInscription returns [EObject current=null] : (otherlv_0= 'inscription' otherlv_1= '{' otherlv_2= 'utilisateur' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'evenement' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleInscription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalEvms.g:701:2: ( (otherlv_0= 'inscription' otherlv_1= '{' otherlv_2= 'utilisateur' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'evenement' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalEvms.g:702:2: (otherlv_0= 'inscription' otherlv_1= '{' otherlv_2= 'utilisateur' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'evenement' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalEvms.g:702:2: (otherlv_0= 'inscription' otherlv_1= '{' otherlv_2= 'utilisateur' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'evenement' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalEvms.g:703:3: otherlv_0= 'inscription' otherlv_1= '{' otherlv_2= 'utilisateur' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'evenement' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInscriptionAccess().getInscriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getInscriptionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInscriptionAccess().getUtilisateurKeyword_2());
            		
            // InternalEvms.g:715:3: ( (otherlv_3= RULE_ID ) )
            // InternalEvms.g:716:4: (otherlv_3= RULE_ID )
            {
            // InternalEvms.g:716:4: (otherlv_3= RULE_ID )
            // InternalEvms.g:717:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInscriptionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_3, grammarAccess.getInscriptionAccess().getUtilisateurUtilisateurCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getInscriptionAccess().getEvenementKeyword_4());
            		
            // InternalEvms.g:732:3: ( (otherlv_5= RULE_ID ) )
            // InternalEvms.g:733:4: (otherlv_5= RULE_ID )
            {
            // InternalEvms.g:733:4: (otherlv_5= RULE_ID )
            // InternalEvms.g:734:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInscriptionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getInscriptionAccess().getEvenementEvenementCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInscriptionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInscription"


    // $ANTLR start "entryRuleNotification"
    // InternalEvms.g:753:1: entryRuleNotification returns [EObject current=null] : iv_ruleNotification= ruleNotification EOF ;
    public final EObject entryRuleNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotification = null;


        try {
            // InternalEvms.g:753:53: (iv_ruleNotification= ruleNotification EOF )
            // InternalEvms.g:754:2: iv_ruleNotification= ruleNotification EOF
            {
             newCompositeNode(grammarAccess.getNotificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotification=ruleNotification();

            state._fsp--;

             current =iv_ruleNotification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotification"


    // $ANTLR start "ruleNotification"
    // InternalEvms.g:760:1: ruleNotification returns [EObject current=null] : (otherlv_0= 'notification' otherlv_1= '{' otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'destinataire' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'evenement' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleNotification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalEvms.g:766:2: ( (otherlv_0= 'notification' otherlv_1= '{' otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'destinataire' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'evenement' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalEvms.g:767:2: (otherlv_0= 'notification' otherlv_1= '{' otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'destinataire' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'evenement' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalEvms.g:767:2: (otherlv_0= 'notification' otherlv_1= '{' otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'destinataire' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'evenement' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalEvms.g:768:3: otherlv_0= 'notification' otherlv_1= '{' otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'destinataire' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'evenement' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNotificationAccess().getNotificationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getNotificationAccess().getMessageKeyword_2());
            		
            // InternalEvms.g:780:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalEvms.g:781:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalEvms.g:781:4: (lv_message_3_0= RULE_STRING )
            // InternalEvms.g:782:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_message_3_0, grammarAccess.getNotificationAccess().getMessageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getNotificationAccess().getDestinataireKeyword_4());
            		
            // InternalEvms.g:802:3: ( (otherlv_5= RULE_ID ) )
            // InternalEvms.g:803:4: (otherlv_5= RULE_ID )
            {
            // InternalEvms.g:803:4: (otherlv_5= RULE_ID )
            // InternalEvms.g:804:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_5, grammarAccess.getNotificationAccess().getDestinataireUtilisateurCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getNotificationAccess().getEvenementKeyword_6());
            		
            // InternalEvms.g:819:3: ( (otherlv_7= RULE_ID ) )
            // InternalEvms.g:820:4: (otherlv_7= RULE_ID )
            {
            // InternalEvms.g:820:4: (otherlv_7= RULE_ID )
            // InternalEvms.g:821:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_7, grammarAccess.getNotificationAccess().getEvenementEvenementCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotification"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000304041002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000304241000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000090200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});

}