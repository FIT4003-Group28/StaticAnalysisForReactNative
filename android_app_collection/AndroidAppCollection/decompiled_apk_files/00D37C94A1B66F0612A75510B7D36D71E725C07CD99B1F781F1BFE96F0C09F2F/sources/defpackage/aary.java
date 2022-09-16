package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aary  reason: default package */
/* loaded from: classes.dex */
public final class aary {
    public final boolean a;
    public final boolean b;
    private final aoxc c;
    private List d;

    public aary(aoxc aoxcVar) {
        aoxcVar.getClass();
        this.c = aoxcVar;
        boolean z = false;
        this.a = false;
        aoxa aoxaVar = aoxcVar.c;
        this.b = 1 == ((aoxaVar == null ? aoxa.a : aoxaVar).b & 1) ? true : z;
    }

    public static aary b(String str, aarx aarxVar) {
        zgh.m(str);
        return new aary(str, aarxVar);
    }

    public final aarx a() {
        for (Object obj : c()) {
            if (obj instanceof aarx) {
                aarx aarxVar = (aarx) obj;
                if (!aarxVar.b()) {
                    return aarxVar;
                }
            }
        }
        return null;
    }

    public final List c() {
        if (this.d == null) {
            this.d = new ArrayList(this.c.b.size() + 1);
            aoxa aoxaVar = this.c.c;
            if (aoxaVar == null) {
                aoxaVar = aoxa.a;
            }
            if ((aoxaVar.b & 1) != 0) {
                List list = this.d;
                aoxa aoxaVar2 = this.c.c;
                if (aoxaVar2 == null) {
                    aoxaVar2 = aoxa.a;
                }
                aowz aowzVar = aoxaVar2.c;
                if (aowzVar == null) {
                    aowzVar = aowz.a;
                }
                list.add(aowzVar);
            }
            for (aoxb aoxbVar : this.c.b) {
                if (aoxbVar.b == 62381864) {
                    this.d.add(new aarw((aowy) aoxbVar.c));
                }
            }
            if (this.d == null) {
                this.d = Collections.emptyList();
            }
        }
        return this.d;
    }

    private aary(String str, aarx aarxVar) {
        this.c = null;
        aopa createBuilder = aowz.a.createBuilder();
        arag g = ajgl.g(str);
        createBuilder.copyOnWrite();
        aowz aowzVar = (aowz) createBuilder.instance;
        g.getClass();
        aowzVar.c = g;
        aowzVar.b |= 1;
        ArrayList arrayList = new ArrayList(2);
        this.d = arrayList;
        arrayList.add((aowz) createBuilder.mo39build());
        this.d.add(aarxVar);
        this.a = true;
        this.b = true;
    }
}
