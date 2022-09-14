package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bixa  reason: default package */
/* loaded from: classes3.dex */
public class bixa implements biwi {
    private final String a;
    @dzsi
    private final String b;
    private final gga c;
    private final cklf d;
    private final btpc e;

    public bixa(cklf cklfVar, gga ggaVar, btpc btpcVar, String str, @dzsi String str2) {
        this.d = cklfVar;
        this.c = ggaVar;
        this.a = str;
        this.b = str2;
        this.e = btpcVar;
    }

    @Override // defpackage.biwi
    public String a() {
        return this.a;
    }

    @Override // defpackage.biwi
    @dzsi
    public String b() {
        return this.b;
    }

    @Override // defpackage.biwi
    public Boolean c() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.biwi
    public cqkl d() {
        this.c.s();
        return cqkl.a;
    }

    @Override // defpackage.biwi
    public cqkl e() {
        if (this.e.i()) {
            this.d.a("plus_codes_android");
        } else {
            gga ggaVar = this.c;
            Toast.makeText(ggaVar, ggaVar.getResources().getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_TITLE), 1).show();
        }
        return cqkl.a;
    }
}
