package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: ajwq  reason: default package */
/* loaded from: classes2.dex */
public class ajwq implements ajwm {
    private final aida a;
    private final alp b;
    private final String c;
    private final PersonId d;
    private final Integer e;
    private final Boolean f;
    @dzsi
    private final String g;
    private final cqtd h;
    private final cjtd i;
    @dzsi
    private String j = null;

    public ajwq(Resources resources, aida aidaVar, alp alpVar, bvsl bvslVar, cqhn cqhnVar, String str, PersonId personId, Integer num, Boolean bool, @dzsi String str2, @dzsi String str3, cjtd cjtdVar) {
        this.a = aidaVar;
        this.b = alpVar;
        this.c = str;
        this.d = personId;
        this.e = num;
        this.f = bool;
        this.g = str2;
        aicy f = aicz.f();
        f.e(personId);
        f.f(true);
        f.c(ahvf.FRESH);
        f.d(1);
        f.b(dbsj.e(str2));
        Bitmap a = aidaVar.a(f.a(), new dbsz(this) { // from class: ajwo
            private final ajwq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                PersonId personId2 = (PersonId) obj;
                cqkx.p(this.a);
            }
        });
        this.h = new ajwp(new Object[]{a}, a);
        this.i = cjtdVar;
    }

    @Override // defpackage.ajwm
    public cqtd a() {
        return this.h;
    }

    @Override // defpackage.ajwm
    public CharSequence b() {
        return this.b.b(this.c);
    }

    @Override // defpackage.ajwm
    @dzsi
    public CharSequence c() {
        return this.j;
    }

    @Override // defpackage.ajwm
    public cjtd d() {
        return this.i;
    }

    public void e(@dzsi String str) {
        this.j = str;
        cqkx.p(this);
    }

    @Override // defpackage.ajvb
    public Boolean j() {
        return true;
    }

    @Override // defpackage.ajvb
    @dzsi
    public Integer k() {
        return this.e;
    }

    @Override // defpackage.ajvb
    public CharSequence l() {
        return b();
    }

    @Override // defpackage.ajvb
    @dzsi
    public Boolean m() {
        return this.f;
    }

    @Override // defpackage.ajvb
    @dzsi
    public cjtd n() {
        return null;
    }
}
