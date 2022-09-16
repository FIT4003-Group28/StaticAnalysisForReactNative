package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.application.Shell_UploadActivity;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ebt  reason: default package */
/* loaded from: classes3.dex */
public final class ebt extends vyw {
    public final wge a;
    public final eyj b;
    private final aacz e;

    public ebt(Activity activity, afvn afvnVar, eyj eyjVar, aacz aaczVar, wge wgeVar) {
        super(activity, afvnVar);
        this.b = eyjVar;
        this.e = aaczVar;
        this.a = wgeVar;
    }

    @Override // defpackage.vyw
    public final List a() {
        ArrayList arrayList = new ArrayList();
        if (this.d.t()) {
            asxj asxjVar = this.e.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.f110J) {
                View inflate = LayoutInflater.from(this.c).inflate(R.layout.fusion_manage_account_footer, (ViewGroup) null);
                inflate.setOnClickListener(new ebs(this, 1));
                arrayList.add(inflate);
                View inflate2 = LayoutInflater.from(this.c).inflate(R.layout.fusion_account_help_footer, (ViewGroup) null);
                inflate2.setOnClickListener(new ebs(this));
                arrayList.add(inflate2);
            } else {
                View inflate3 = LayoutInflater.from(this.c).inflate(R.layout.fusion_sign_out_footer, (ViewGroup) null);
                inflate3.setOnClickListener(new ebs(this, 2));
                arrayList.add(inflate3);
            }
        }
        return arrayList;
    }

    @Override // defpackage.vyw
    public final boolean b() {
        char c;
        if (!this.d.t()) {
            return false;
        }
        Activity activity = this.c;
        if (activity instanceof WatchWhileActivity) {
            c = 1;
        } else if (activity instanceof Shell_UploadActivity) {
            c = 2;
        } else {
            c = activity instanceof LiveCreationActivity ? (char) 3 : (char) 0;
        }
        return (c == 2 || c == 3) ? false : true;
    }
}
