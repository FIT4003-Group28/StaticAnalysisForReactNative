package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.common.util.concurrent.SettableFuture;
/* compiled from: PG */
/* renamed from: afqn  reason: default package */
/* loaded from: classes.dex */
public final class afqn implements afre {
    qst a;
    private final Context b;
    private final aadd c;

    public afqn(Context context, aadd aaddVar) {
        this.b = context;
        this.c = aaddVar;
    }

    @Override // defpackage.afre
    public final ankt a() {
        final SettableFuture f = SettableFuture.f();
        b(new afrd() { // from class: afqm
            @Override // defpackage.afrd
            public final void a(asvk asvkVar) {
                SettableFuture settableFuture = SettableFuture.this;
                if (asvkVar == null) {
                    settableFuture.e(new IllegalArgumentException("LocationMetadata was null"));
                } else {
                    settableFuture.o(asvkVar);
                }
            }
        });
        return f;
    }

    @Override // defpackage.afre
    public final synchronized void b(final afrd afrdVar) {
        asuw asuwVar = this.c.a().c;
        if (asuwVar == null) {
            asuwVar = asuw.a;
        }
        if (asuwVar.k && akdr.g(this.b)) {
            if (this.a == null) {
                this.a = rgh.a(this.b);
            }
            rve y = this.a.y();
            y.q(new rut() { // from class: afqk
                @Override // defpackage.rut
                public final void a(rve rveVar) {
                    asvk asvkVar;
                    afrd afrdVar2 = afrd.this;
                    Location location = (Location) rveVar.g();
                    if (location == null) {
                        asvkVar = null;
                    } else {
                        aopa createBuilder = asvk.a.createBuilder();
                        double longitude = location.getLongitude();
                        createBuilder.copyOnWrite();
                        asvk asvkVar2 = (asvk) createBuilder.instance;
                        asvkVar2.b |= 2;
                        asvkVar2.d = longitude;
                        double latitude = location.getLatitude();
                        createBuilder.copyOnWrite();
                        asvk asvkVar3 = (asvk) createBuilder.instance;
                        asvkVar3.b |= 1;
                        asvkVar3.c = latitude;
                        float accuracy = location.getAccuracy();
                        createBuilder.copyOnWrite();
                        asvk asvkVar4 = (asvk) createBuilder.instance;
                        asvkVar4.b |= 4;
                        asvkVar4.e = accuracy;
                        asvkVar = (asvk) createBuilder.mo39build();
                    }
                    afrdVar2.a(asvkVar);
                }
            });
            y.n(new ruw() { // from class: afql
                @Override // defpackage.ruw
                public final void c(Exception exc) {
                    afrd.this.a(null);
                }
            });
            return;
        }
        afrdVar.a(null);
    }
}
