package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aakq  reason: default package */
/* loaded from: classes.dex */
public final class aakq {
    public final aslq a;
    private List b;
    private List c;

    public aakq(aslq aslqVar) {
        aslqVar.getClass();
        this.a = aslqVar;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ArrayList(this.a.f.size());
            for (asls aslsVar : this.a.f) {
                int i = aslsVar.b;
                if ((i & 1) != 0) {
                    List list = this.c;
                    atof atofVar = aslsVar.c;
                    if (atofVar == null) {
                        atofVar = atof.a;
                    }
                    list.add(ajna.g(atofVar));
                } else if ((i & 4) != 0) {
                    List list2 = this.c;
                    aumx aumxVar = aslsVar.e;
                    if (aumxVar == null) {
                        aumxVar = aumx.a;
                    }
                    list2.add(ajna.g(aumxVar));
                } else if ((i & 2) != 0) {
                    List list3 = this.c;
                    augq augqVar = aslsVar.d;
                    if (augqVar == null) {
                        augqVar = augq.a;
                    }
                    list3.add(ajna.g(augqVar));
                } else if ((i & 8) != 0) {
                    List list4 = this.c;
                    avia aviaVar = aslsVar.f;
                    if (aviaVar == null) {
                        aviaVar = avia.a;
                    }
                    list4.add(ajna.g(aviaVar));
                }
            }
        }
        return this.c;
    }

    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList(this.a.e.size());
            for (aslt asltVar : this.a.e) {
                if ((asltVar.c & 268435456) != 0) {
                    auuf auufVar = asltVar.W;
                    if (auufVar == null) {
                        auufVar = auuf.a;
                    }
                    if ((auufVar.b & 4194304) != 0) {
                        auuh auuhVar = auufVar.r;
                        if (auuhVar == null) {
                            auuhVar = auuh.a;
                        }
                        if ((auuhVar.b & 4) != 0) {
                            this.b.add(new aakp(auufVar));
                        } else {
                            auuh auuhVar2 = auufVar.r;
                            if (auuhVar2 == null) {
                                auuhVar2 = auuh.a;
                            }
                            if ((auuhVar2.b & 8) != 0) {
                                this.b.add(new aald(auufVar));
                            }
                        }
                    }
                } else {
                    aoqu b = aakx.b(asltVar);
                    if (b != null) {
                        this.b.add(b);
                    }
                }
            }
        }
        return this.b;
    }
}
