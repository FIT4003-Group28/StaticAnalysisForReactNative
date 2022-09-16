package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aalc  reason: default package */
/* loaded from: classes.dex */
public final class aalc {
    public final List a;
    private avhn b;

    public aalc() {
        this.b = null;
        this.a = Collections.emptyList();
    }

    public aalc(List list) {
        this.b = null;
        this.a = list;
    }

    public final aalb a() {
        if (!f()) {
            return null;
        }
        List list = this.a;
        return (aalb) list.get(list.size() - 1);
    }

    public final aalb b(int i, int i2) {
        aalb aalbVar = null;
        if (f() && i >= 0 && i2 >= 0) {
            int i3 = 0;
            for (aalb aalbVar2 : this.a) {
                int i4 = i - aalbVar2.a;
                int i5 = i2 - aalbVar2.b;
                int i6 = (i4 * i4) + (i5 * i5);
                if (aalbVar == null || i6 < i3) {
                    aalbVar = aalbVar2;
                    i3 = i6;
                }
            }
        }
        return aalbVar;
    }

    public final aalb c(int i) {
        if (!f()) {
            return null;
        }
        if (i <= 0) {
            return d();
        }
        for (aalb aalbVar : this.a) {
            if (aalbVar.a >= i) {
                return aalbVar;
            }
        }
        return a();
    }

    public final aalb d() {
        if (!f()) {
            return null;
        }
        return (aalb) this.a.get(0);
    }

    public final avhn e() {
        if (this.b == null) {
            aopc aopcVar = (aopc) avhn.a.createBuilder();
            int size = this.a.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    aopa createBuilder = avhm.a.createBuilder();
                    int i2 = ((aalb) this.a.get(i)).a;
                    createBuilder.copyOnWrite();
                    avhm avhmVar = (avhm) createBuilder.instance;
                    avhmVar.b |= 2;
                    avhmVar.d = i2;
                    int i3 = ((aalb) this.a.get(i)).b;
                    createBuilder.copyOnWrite();
                    avhm avhmVar2 = (avhm) createBuilder.instance;
                    avhmVar2.b |= 4;
                    avhmVar2.e = i3;
                    String uri = ((aalb) this.a.get(i)).a().toString();
                    createBuilder.copyOnWrite();
                    avhm avhmVar3 = (avhm) createBuilder.instance;
                    uri.getClass();
                    avhmVar3.b |= 1;
                    avhmVar3.c = uri;
                    aopcVar.cw(createBuilder);
                }
            }
            this.b = (avhn) aopcVar.mo39build();
        }
        return this.b;
    }

    public final boolean f() {
        return this.a.size() > 0;
    }

    public aalc(avhn avhnVar) {
        this.b = avhnVar;
        if (avhnVar != null) {
            this.a = new ArrayList(avhnVar.c.size());
            for (avhm avhmVar : avhnVar.c) {
                this.a.add(new aalb(avhmVar));
            }
            return;
        }
        this.a = Collections.emptyList();
    }

    public aalc(Uri... uriArr) {
        this.a = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            this.a.add(new aalb(uriArr[i], 0, 0));
        }
        this.b = null;
    }
}
