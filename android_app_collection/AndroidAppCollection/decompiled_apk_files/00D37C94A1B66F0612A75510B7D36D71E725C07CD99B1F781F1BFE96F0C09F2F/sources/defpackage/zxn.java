package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zxn  reason: default package */
/* loaded from: classes4.dex */
public final class zxn {
    public final yrj a;
    public final SharedPreferences b;
    public final String c;
    public final nx d;
    private final Context e;
    private final String f;

    public zxn(Context context, SharedPreferences sharedPreferences, yrj yrjVar, ild ildVar) {
        this.e = context;
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        yrjVar.getClass();
        this.a = yrjVar;
        String string = context.getString(R.string.upload_network_policy_pref_value_any);
        this.c = string;
        this.f = context.getString(R.string.upload_network_policy_pref_value_wifi);
        if (!sharedPreferences.contains(ymf.UPLOAD_NETWORK_POLICY)) {
            a(string);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.cellular_upload_dialog_contents, (ViewGroup) null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.do_not_ask_again_checkbox);
        zxk zxkVar = new zxk(this, checkBox, ildVar);
        zxl zxlVar = new zxl(ildVar);
        nw nwVar = new nw(context);
        nwVar.n(R.string.cellular_upload_dialog_title);
        nwVar.p(inflate);
        nwVar.h(R.string.cellular_upload_dialog_action_negative, zxkVar);
        nwVar.k(R.string.cellular_upload_dialog_action_positive, zxkVar);
        nwVar.j(zxlVar);
        nx b = nwVar.b();
        checkBox.setOnCheckedChangeListener(new zxm(b));
        this.d = b;
    }

    public final void a(String str) {
        this.b.edit().putString(ymf.UPLOAD_NETWORK_POLICY, str).apply();
    }

    public final boolean b() {
        return akzj.f(this.b.getString(ymf.UPLOAD_NETWORK_POLICY, null), this.f);
    }
}
