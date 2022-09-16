package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: tnu  reason: default package */
/* loaded from: classes7.dex */
final class tnu extends tnt {
    private volatile transient boolean f;
    private volatile transient boolean g;
    private volatile transient dcep<dqvj> h;
    private volatile transient dcep<dqvh> i;

    public tnu(dcep<tnz> dcepVar, dcep<tob> dcepVar2, dcep<drsm> dcepVar3) {
        super(dcepVar, dcepVar2, dcepVar3);
    }

    @Override // defpackage.tog
    public final boolean e() {
        boolean z;
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty()) {
                        z = false;
                        this.f = z;
                        this.g = true;
                    }
                    z = true;
                    this.f = z;
                    this.g = true;
                }
            }
        }
        return this.f;
    }

    @Override // defpackage.tog
    public final dcep<dqvj> f() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    HashSet hashSet = new HashSet();
                    dcpd<tnz> it = this.a.iterator();
                    while (it.hasNext()) {
                        dqvj dqvjVar = tog.d.get(it.next());
                        if (dqvjVar != null) {
                            hashSet.add(dqvjVar);
                        }
                    }
                    this.h = dcep.K(hashSet);
                    if (this.h == null) {
                        throw new NullPointerException("getPreferredTravelModes() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }

    @Override // defpackage.tog
    public final dcep<dqvh> g() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    HashSet hashSet = new HashSet();
                    dcpd<tnz> it = this.a.iterator();
                    while (it.hasNext()) {
                        dqvh dqvhVar = tog.e.get(it.next());
                        if (dqvhVar != null) {
                            hashSet.add(dqvhVar);
                        }
                    }
                    this.i = dcep.K(hashSet);
                    if (this.i == null) {
                        throw new NullPointerException("getPreferredTransitVehicleTypes() cannot return null");
                    }
                }
            }
        }
        return this.i;
    }
}
