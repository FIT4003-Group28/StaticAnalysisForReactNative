package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dha  reason: default package */
/* loaded from: classes3.dex */
public final class dha implements dhu {
    public static final boolean a = dfz.a;
    public final dhu b;
    public final String d;
    public final tmt h;
    public final SparseArray c = new SparseArray();
    public int e = Integer.MAX_VALUE;
    public int f = -1;
    public int g = -1;

    public dha(dhu dhuVar, tmt tmtVar, String str, byte[] bArr) {
        this.b = dhuVar;
        this.h = tmtVar;
        this.d = str;
    }

    private static List b(int i, int i2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            dlj dljVar = (dlj) sparseArray.get(i3);
            if (dljVar == null) {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", Integer.valueOf(i3)));
            }
            arrayList.add(dljVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i = this.e;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        int i2 = 0;
        if (i == 1) {
            List b = b(this.f, this.g, this.c);
            if (this.g > 1) {
                dhu dhuVar = this.b;
                int i3 = this.f;
                din dinVar = (din) dhuVar;
                if (dinVar.b) {
                    dlc dlcVar = dinVar.a;
                    dlcVar.u();
                    if (dlm.a) {
                        String[] strArr = new String[b.size()];
                        for (int i4 = 0; i4 < b.size(); i4++) {
                            strArr[i4] = ((dlj) b.get(i4)).r();
                        }
                        dlcVar.hashCode();
                        b.size();
                        String.valueOf(Arrays.toString(strArr)).length();
                    }
                    synchronized (dlcVar) {
                        dlcVar.z = true;
                        int size = b.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            dlj dljVar = (dlj) b.get(i5);
                            dlc.t(dljVar);
                            int i6 = i3 + i5;
                            dkp q = dlcVar.q(i6, dljVar);
                            dlcVar.c.add(i6, q.b);
                            dlcVar.F(q);
                        }
                    }
                } else {
                    dinVar.a.w(i3, b);
                }
                if (a) {
                    int i7 = this.f;
                    while (i2 < b.size()) {
                        this.h.f(this.d, i7 + i2, (dlj) b.get(i2), Thread.currentThread().getName());
                        i2++;
                    }
                }
            } else {
                dhu dhuVar2 = this.b;
                int i8 = this.f;
                dlj dljVar2 = (dlj) this.c.get(i8);
                din dinVar2 = (din) dhuVar2;
                if (dinVar2.b) {
                    dlc dlcVar2 = dinVar2.a;
                    dlcVar2.u();
                    if (dlm.a) {
                        dlcVar2.hashCode();
                        String.valueOf(dljVar2.r()).length();
                    }
                    dlc.t(dljVar2);
                    dkp q2 = dlcVar2.q(i8, dljVar2);
                    synchronized (dlcVar2) {
                        dlcVar2.z = true;
                        dlcVar2.c.add(i8, q2.b);
                        dlcVar2.F(q2);
                    }
                } else {
                    dlc dlcVar3 = dinVar2.a;
                    if (dlm.a) {
                        dlcVar3.hashCode();
                        String.valueOf(dljVar2.r()).length();
                    }
                    dlc.t(dljVar2);
                    diz p = dlcVar3.p(dljVar2);
                    synchronized (dlcVar3) {
                        if (dlcVar3.z) {
                            throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                        }
                        dlcVar3.b.add(i8, p);
                        dlcVar3.F.a(dljVar2);
                    }
                    dlcVar3.e.ol(i8);
                    dmp dmpVar = dlcVar3.D;
                    dmpVar.c(dmpVar.f(i8, dlcVar3.w));
                }
                if (a) {
                    tmt tmtVar = this.h;
                    String str = this.d;
                    int i9 = this.f;
                    tmtVar.f(str, i9, (dlj) this.c.get(i9), Thread.currentThread().getName());
                }
            }
        } else if (i == 2) {
            List b2 = b(this.f, this.g, this.c);
            if (this.g > 1) {
                dhu dhuVar3 = this.b;
                int i10 = this.f;
                din dinVar3 = (din) dhuVar3;
                if (dinVar3.b) {
                    dlc dlcVar4 = dinVar3.a;
                    dlcVar4.u();
                    if (dlm.a) {
                        dlcVar4.hashCode();
                        b2.size();
                    }
                    synchronized (dlcVar4) {
                        dlcVar4.r(new dkv(i10, b2));
                    }
                } else {
                    dinVar3.a.M(i10, b2);
                }
                if (a) {
                    int i11 = this.f;
                    while (i2 < b2.size()) {
                        this.h.i(this.d, i11 + i2, (dlj) b2.get(i2), Thread.currentThread().getName());
                        i2++;
                    }
                }
            } else {
                dhu dhuVar4 = this.b;
                int i12 = this.f;
                dlj dljVar3 = (dlj) this.c.get(i12);
                din dinVar4 = (din) dhuVar4;
                if (dinVar4.b) {
                    dlc dlcVar5 = dinVar4.a;
                    dlcVar5.u();
                    if (dlm.a) {
                        dlcVar5.hashCode();
                    }
                    synchronized (dlcVar5) {
                        dlcVar5.r(new dku(i12, dljVar3));
                    }
                } else {
                    dinVar4.a.L(i12, dljVar3);
                }
                if (a) {
                    tmt tmtVar2 = this.h;
                    String str2 = this.d;
                    int i13 = this.f;
                    tmtVar2.i(str2, i13, (dlj) this.c.get(i13), Thread.currentThread().getName());
                }
            }
        } else if (i == 3) {
            int i14 = this.g;
            if (i14 > 1) {
                dhu dhuVar5 = this.b;
                int i15 = this.f;
                din dinVar5 = (din) dhuVar5;
                if (dinVar5.b) {
                    dlc dlcVar6 = dinVar5.a;
                    dlcVar6.u();
                    if (dlm.a) {
                        dlcVar6.hashCode();
                    }
                    dkt dktVar = new dkt(i15, i14);
                    synchronized (dlcVar6) {
                        dlcVar6.z = true;
                        for (int i16 = 0; i16 < i14; i16++) {
                            dlcVar6.c.remove(i15);
                        }
                        dlcVar6.r(dktVar);
                    }
                } else {
                    dinVar5.a.I(i15, i14);
                }
                if (a) {
                    int i17 = this.f;
                    int i18 = this.g;
                    while (i2 < i18) {
                        this.h.e(this.d, i17 + i2, Thread.currentThread().getName());
                        i2++;
                    }
                }
            } else {
                dhu dhuVar6 = this.b;
                int i19 = this.f;
                din dinVar6 = (din) dhuVar6;
                if (dinVar6.b) {
                    dlc dlcVar7 = dinVar6.a;
                    dlcVar7.u();
                    if (dlm.a) {
                        dlcVar7.hashCode();
                    }
                    dks dksVar = new dks(i19);
                    synchronized (dlcVar7) {
                        dlcVar7.z = true;
                        dlcVar7.c.remove(i19);
                        dlcVar7.r(dksVar);
                    }
                } else {
                    dinVar6.a.H(i19);
                }
                if (a) {
                    this.h.e(this.d, this.f, Thread.currentThread().getName());
                }
            }
        }
        this.e = Integer.MAX_VALUE;
        this.c.clear();
    }
}
