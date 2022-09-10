package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: ngp  reason: default package */
/* loaded from: classes7.dex */
public class ngp implements nfw {
    private static final crec a = new ngn();
    private final crem b;
    private final noo c;
    private final cref d;
    private final dbty<crfj> e;
    private crec f = a;

    public ngp(crem cremVar, noo nooVar, final cref crefVar, cqhn cqhnVar) {
        this.b = cremVar;
        this.c = nooVar;
        this.d = crefVar;
        dbty<crfj> dbtyVar = new dbty(crefVar) { // from class: ngm
            private final cref a;

            {
                this.a = crefVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return crfj.c(crfi.TEST_NAVIGATION_VOICE, dbtx.a(String.valueOf(this.a.q().a.getString(R.string.CAR_TEST_NAVIGATION_VOICE_MESSAGE)).concat(" "), 2), amsv.b(Collections.nCopies(2, new amsu(8))));
            }
        };
        this.e = dbtyVar;
        crefVar.f(Arrays.asList(dbtyVar.a()));
    }

    @Override // defpackage.nfw
    public Boolean a(cren crenVar) {
        return Boolean.valueOf(this.b.f() == crenVar);
    }

    @Override // defpackage.nfw
    public cqkl b(cren crenVar) {
        this.b.j(crenVar);
        cqkx.p(this);
        this.c.a();
        return cqkl.a;
    }

    @Override // defpackage.nfw
    public cqkl c() {
        crec crecVar = this.f;
        crec crecVar2 = a;
        if (crecVar == crecVar2) {
            this.d.t();
            this.f = this.d.b(this.e.a(), crej.TEST_AUDIO, new ngo(this));
        } else {
            this.f = crecVar2;
            this.d.t();
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.nfw
    public Boolean d() {
        return Boolean.valueOf(this.f != a);
    }

    @Override // defpackage.nfw
    public void e() {
        crec crecVar = this.f;
        crec crecVar2 = a;
        if (crecVar != crecVar2) {
            this.f = crecVar2;
            this.d.t();
            cqkx.p(this);
        }
    }
}
