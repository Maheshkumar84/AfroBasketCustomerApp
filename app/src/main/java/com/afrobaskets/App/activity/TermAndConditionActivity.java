package com.afrobaskets.App.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.webistrasoft.org.ecommerce.R;
import com.webistrasoft.org.ecommerce.databinding.SignupActivityBinding;

/**
 * Created by HP-PC on 11/27/2017.
 */

public class TermAndConditionActivity extends AppCompatActivity {

    SignupActivityBinding signupActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        TextView textView=(TextView)findViewById(R.id.dummy_txt);
        textView.setText(Html.fromHtml("<h2>INTRODUCTION</h2>\n" +
                "Welcome to afrobaskets.com website (the &quot;Site&quot;). These terms and conditions (&quot;Terms and Conditions&quot;) apply to\n" +
                "the Site, and all of its divisions, subsidiaries, and affiliate operated Internet sites which reference these Terms\n" +
                "and Conditions.\n" +
                "By accessing the Site, you confirm your understanding of the Terms and Conditions. If you do not agree to these\n" +
                "Terms and Conditions of use, you shall not use this website. The Site reserves the right, to change, modify, add,\n" +
                "or remove portions of these Terms and Conditions of use at any time. Changes will be effective when posted on\n" +
                "the Site with no other notice provided. Please check these Terms and Conditions of use regularly for updates.\n" +
                "Your continued use of the Site following the posting of changes to these Terms and Conditions of use constitutes\n" +
                "your acceptance of those changes.\n" +
                "<h2>USE OF THE SITE</h2>\n" +
                "You are either at least 18 years of age or are accessing the Site under the supervision of a parent or legal\n" +
                "guardian.We grant you a non-transferable and revocable license to use the Site, under the Terms and Conditions\n" +
                "described, for the purpose of shopping for personal items sold on the Site. Commercial use or use on behalf of\n" +
                "any third party is prohibited, except as explicitly permitted by us in advance. Any breach of these Terms and\n" +
                "Conditions shall result in the immediate revocation of the license granted in this paragraph without notice to you.\n" +
                "Content provided on this site is solely for informational purposes. Product representations expressed on this Site\n" +
                "are those of the vendor and are not made by us. Submissions or opinions expressed on this Site are those of the\n" +
                "individual posting such content and may not reflect our opinions.\n" +
                "Certain services and related features that may be made available on the Site may require registration or\n" +
                "subscription. Should you choose to register or subscribe for any such services or related features, you agree to\n" +
                "provide accurate and current information about yourself, and to promptly update such information if there are any\n" +
                "changes. Every user of the Site is solely responsible for keeping passwords and other account identifiers safe\n" +
                "and secure. The account owner is entirely responsible for all activities that occur under such password or\n" +
                "account. Furthermore, you must notify us of any unauthorized use of your password or account. The Site shall\n" +
                "not be responsible or liable, directly or indirectly, in any way for any loss or damage of any kind incurred as a\n" +
                "result of, or in connection with, your failure to comply with this section.\n" +
                "During the registration process you agree to receive promotional emails from the Site. You can subsequently opt\n" +
                "out of receiving such promotional e-mails by clicking on the link at the bottom of any promotional email.\n" +
                "\n" +
                "<h2>USER SUBMISSIONS</h2>\n" +
                "Anything that you submit to the Site and/or provide to us, including but not limited to, questions, reviews,\n" +
                "comments, and suggestions (collectively, &quot;Submissions&quot;) will become our sole and exclusive property and shall\n" +
                "not be returned to you. In addition to the rights applicable to any Submission, when you post comments or\n" +
                "reviews to the Site, you also grant us the right to use the name that you submit, in connection with such review,\n" +
                "comment, or other content. You shall not use a false e-mail address, pretend to be someone other than yourself\n" +
                "or otherwise mislead us or third parties as to the origin of any Submissions. We may, but shall not be obligated\n" +
                "to, remove or edit any Submissions.\n" +
                "<h2>ORDER ACCEPTANCE AND PRICING</h2>\n" +
                "Please note that there are cases when an order cannot be processed for various reasons. The Site reserves the\n" +
                "right to refuse or cancel any order for any reason at any given time. You may be asked to provide additional\n" +
                "verifications or information, including but not limited to phone number and address, before we accept the order.\n" +
                "In order to avoid any fraud with credit or debit cards, we reserve the right to obtain validation of your payment\n" +
                "details before providing you with the product and to verify the personal information you shared with us. This\n" +
                "verification can take the shape of an identity, place of residence or banking information check. The absence of an\n" +
                "answer following such a demand will automatically cause the cancellation of the order within 2 days.We reserve\n" +
                "the right to proceed to direct cancellation of an order for which we suspect a risk of fraudulent use of credit or\n" +
                "debit card.\n" +
                "We are determined to provide the most accurate pricing information on the Site to our users; however, errors may\n" +
                "still occur, such as cases when the price of an item is not displayed correctly on the website. As such, we reserve\n" +
                "\n" +
                "the right to refuse or cancel any order. In the event that an item is mispriced, we may, at our own discretion,\n" +
                "either contact you for instructions or cancel your order and notify you of such cancellation. We shall have the right\n" +
                "to refuse or cancel any such orders whether or not the order has been confirmed and your credit card charged.\n" +
                "<h2>TRADEMARKS AND COPYRIGHTS</h2>\n" +
                "All intellectual property rights, whether registered or unregistered, in the Site, information content on the Site and\n" +
                "all the website design, including, but not limited to text, graphics, software, photos, video, music, sound, and their\n" +
                "selection and arrangement, and all software compilations, underlying source code and software shall remain our\n" +
                "property. The entire contents of the Site also are protected by copyright as a collective work under Ghanaian\n" +
                "copyright laws and international conventions. All rights are reserved.\n" +
                "<h2>ARBITRATIONS</h2>\n" +
                "Any disputes, controversies, or differences arising out of the implementation, interpretation, performance of these\n" +
                "Terms and Conditions, shall be finally settled through arbitration by a single arbitrator to be appointed in\n" +
                "accordance with the rules of Chartered Institute of Arbitrators. The arbitrator shall be a person who is legally\n" +
                "trained and who has experience in the information technology field and is independent of either party. The venue\n" +
                "of the arbitration shall be Nairobi. The language used in the arbitration proceedings shall be English. The award\n" +
                "of the arbitrator shall be final and binding and may be entered in any court of competent jurisdiction and enforced\n" +
                "in accordance with the Arbitration Act 1995 Chapter No. 4. Notwithstanding the foregoing, the Site reserves the\n" +
                "right to pursue the protection of intellectual property rights and confidential information through injunctive or other\n" +
                "equitable relief through competent courts.\n" +
                "<h2>APPLICABLE LAW AND JURISDICTION</h2>\n" +
                "These Terms and Conditions shall be interpreted and governed by the laws in force in Ghana. Each party hereby\n" +
                "agrees to submit to the jurisdiction of the Ghanaians courts and to waive any objections based upon venue.\n" +
                "<h2>TERMINATION</h2>\n" +
                "In addition to any other legal or equitable remedies, we may, without prior notice to you, immediately terminate\n" +
                "the Terms and Conditions or revoke any or all of your rights granted under the Terms and Conditions. Upon any\n" +
                "termination of this Agreement, you shall immediately cease all access to and use of the Site and we shall, in\n" +
                "addition to any other legal or equitable remedies, immediately revoke all password(s) and account identification\n" +
                "issued to you and deny your access to and use of this Site in whole or in part. Any termination of this agreement\n" +
                "shall not affect the respective rights and obligations (including without limitation, payment obligations) of the\n" +
                "parties arising before the date of termination. You furthermore agree that the Site shall not be liable to you or to\n" +
                "any other person as a result of any such suspension or termination. If you are dissatisfied with the Site or with\n" +
                "any terms, conditions, rules, policies, guidelines, or practices of Jade E Services in operating the Site, your sole\n" +
                "and exclusive remedy is to discontinue using the Site."));

        ImageView back = (ImageView) findViewById(R.id.toolbar_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
