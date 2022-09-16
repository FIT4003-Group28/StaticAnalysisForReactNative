package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vyw  reason: default package */
/* loaded from: classes4.dex */
public class vyw {
    public final Activity c;
    protected final afvn d;

    /* JADX INFO: Access modifiers changed from: protected */
    public vyw(Activity activity, afvn afvnVar) {
        this.c = activity;
        this.d = afvnVar;
    }

    public List a() {
        ArrayList arrayList = new ArrayList();
        if (this.d.t()) {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.fusion_manage_account_footer, (ViewGroup) null);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: vyv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vyw.this.c();
                }
            });
            arrayList.add(inflate);
        }
        return arrayList;
    }

    public boolean b() {
        return false;
    }

    public final void c() {
        Intent intent = new Intent("android.settings.SYNC_SETTINGS");
        intent.putExtra("settings", new String[]{"com.google"});
        this.c.startActivity(intent);
    }
}
