package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahjs  reason: default package */
/* loaded from: classes.dex */
public class ahjs extends ahlb implements ahju {
    public final ahli a;
    public boolean b;
    public ahjt c;
    private boolean e;
    private List f;

    public ahjs(ahli ahliVar) {
        this.a = ahliVar;
        this.b = false;
        this.e = true;
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public void j(ahjy ahjyVar) {
        ahjt ahjtVar = this.c;
        if (ahjtVar == null || !this.e || !this.b) {
            return;
        }
        ahjtVar.a();
    }

    @Override // defpackage.ahju
    public final void k(boolean z) {
        this.e = z;
        Iterator it = iterator();
        while (it.hasNext()) {
            ahmf ahmfVar = (ahmf) it.next();
            if (ahmfVar instanceof ahju) {
                ((ahju) ahmfVar).k(z);
            }
        }
    }

    public final void l(ahji ahjiVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(ahjiVar);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public void m(ahjy ahjyVar) {
        List<ahji> list;
        if (!v() && (list = this.f) != null) {
            for (ahji ahjiVar : list) {
                ahjiVar.a(this.b, ahjyVar.b);
            }
        }
        super.m(ahjyVar);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void n(float f, float f2, float f3) {
        super.n(f, f2, f3);
        this.a.a.f(f, f2, f3);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final boolean o(ahjy ahjyVar) {
        return !v() && this.e && this.a.a(ahjyVar).b();
    }

    public final void p(float f, float f2) {
        this.a.b(f, f2);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public void qR(boolean z, ahjy ahjyVar) {
        this.b = z;
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ahmf) it.next()).qR(z, ahjyVar);
        }
    }

    public ahjs(ahoo ahooVar, azqb azqbVar, Bitmap bitmap, float f, Bitmap bitmap2) {
        this(new ahli(ahooVar.clone(), f, f));
        ahni ahniVar = new ahni(bitmap, ahon.a(f, f, ahon.c), ahooVar.clone(), azqbVar);
        ahniVar.a(new ahme(ahniVar, ahme.b(0.8f), ahme.b(1.0f)));
        ahniVar.a(new ahly(ahniVar, 0.1f, 0.2f));
        ahniVar.d = 0.0f;
        ahni ahniVar2 = new ahni(bitmap2, ahon.a(ahom.a(bitmap2.getWidth()), ahom.a(bitmap2.getHeight()), ahon.c), ahooVar.clone(), azqbVar);
        ahniVar2.a(new ahme(ahniVar2, ahme.b(1.0f), ahme.b(1.2f)));
        ahniVar2.d = 0.3f;
        q(ahniVar);
        q(ahniVar2);
    }
}
