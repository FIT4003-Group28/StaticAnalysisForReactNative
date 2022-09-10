package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zon  reason: default package */
/* loaded from: classes7.dex */
public class zon extends zqo implements zea {
    private final Context a;
    private final dqvj b;
    private final cwy c;
    private final wuv d;
    @dzsi
    private final String e;

    public zon(cwy cwyVar, Context context, dqvj dqvjVar, amve amveVar, wuv wuvVar, zfo zfoVar, long j, @dzsi vou vouVar) {
        super(context, amveVar, wuvVar.s(), zfoVar, vouVar, j);
        this.a = context;
        this.b = dqvjVar;
        this.c = cwyVar;
        this.d = wuvVar;
        this.e = zfoVar.d();
    }

    @Override // defpackage.zqo, defpackage.zfp
    public cjtd Z(@dzsi ddho ddhoVar) {
        if (this.b == dqvj.TRANSIT) {
            if (this.d.e()) {
                return super.Z(dtxn.dK);
            }
            return super.Z(dtxn.dO);
        }
        return super.Z(ddhoVar);
    }

    @Override // defpackage.zea
    @dzsi
    public String a() {
        return this.d.b().a();
    }

    @Override // defpackage.zea
    @dzsi
    public String b() {
        if (this.d.e()) {
            return null;
        }
        return this.a.getString(R.string.DIRECTIONS_REQUEST_IN_EXTERNAL_APP, this.d.b().a());
    }

    @Override // defpackage.zea
    @dzsi
    public jhk c() {
        return this.d.b().b();
    }

    @Override // defpackage.zea
    public CharSequence d() {
        return this.d.A(this.a.getResources());
    }

    @Override // defpackage.zea
    @dzsi
    public CharSequence e() {
        return this.d.B(this.a.getResources());
    }

    @Override // defpackage.zea
    public CharSequence f() {
        return dbsj.e(this.d.y(this.a.getResources()));
    }

    @Override // defpackage.zea
    public CharSequence g() {
        return this.d.z(this.a.getResources());
    }

    @Override // defpackage.zea
    public CharSequence h() {
        wuv wuvVar = this.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (wuvVar.p()) {
            cwy.c(spannableStringBuilder, this.a.getResources());
        }
        return spannableStringBuilder.append((CharSequence) dbsj.e(wuvVar.n()));
    }

    @Override // defpackage.zea
    @dzsi
    public CharSequence i() {
        return this.d.o();
    }

    @Override // defpackage.zea
    @dzsi
    public CharSequence j() {
        return this.d.q();
    }

    @Override // defpackage.zea
    public CharSequence p() {
        return "";
    }

    @Override // defpackage.zea
    @dzsi
    public String q() {
        return this.e;
    }

    @Override // defpackage.zea
    public cjtd r(ddho ddhoVar) {
        if (this.b == dqvj.WALK) {
            return super.Z(dtxn.ej);
        }
        return super.Z(ddhoVar);
    }
}
