package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ahte  reason: default package */
/* loaded from: classes.dex */
final class ahte implements ahtg {
    final /* synthetic */ ahti a;
    private final WatchNextResponseModel b;
    private final apzg c;

    public ahte(ahti ahtiVar, WatchNextResponseModel watchNextResponseModel, apzg apzgVar) {
        this.a = ahtiVar;
        this.b = watchNextResponseModel;
        this.c = apzgVar;
    }

    @Override // defpackage.ahtg
    public final ahth a(apzg apzgVar) {
        return new ahth(this.a, apzgVar, true);
    }

    @Override // defpackage.ahtg
    public final ahty b() {
        return ahty.LOGGED_ATTACH_WATCH_NEXT;
    }

    @Override // defpackage.ahtg
    public final apzg c() {
        return this.c;
    }

    @Override // defpackage.ahtg
    public final Optional d(ahhm ahhmVar) {
        return Optional.empty();
    }

    @Override // defpackage.ahtg
    public final void e() {
        ahta ahtaVar = this.a.b;
        WatchNextResponseModel watchNextResponseModel = this.b;
        apzg b = ahtaVar.f ? ahta.b(ahtaVar.d) : null;
        final ahtx ahtxVar = ahtaVar.b;
        ahsz ahszVar = new ahsz(ahtaVar);
        String str = ahtaVar.c;
        if (watchNextResponseModel == null) {
            return;
        }
        ahtxVar.b = ahtx.a(b);
        ahtxVar.b(ahszVar, ByteBuffer.wrap(watchNextResponseModel.d()), b);
        if (str != null) {
            ahtx.c(ahtxVar.e, ahtxVar.b, str);
        }
        ahtxVar.d = watchNextResponseModel.d();
        if (watchNextResponseModel.h == null) {
            return;
        }
        ampg ampgVar = new ampg() { // from class: ahtw
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                ahtx ahtxVar2 = ahtx.this;
                apzg apzgVar = (apzg) obj;
                if (apzgVar == null) {
                    return null;
                }
                return ahtxVar2.e.f(apzgVar);
            }
        };
        aaks aaksVar = watchNextResponseModel.h;
        if (aaksVar == null) {
            return;
        }
        aako aakoVar = aaksVar.a;
        if (aakoVar != null) {
            aakoVar.e(ampgVar);
        }
        aako aakoVar2 = aaksVar.b;
        if (aakoVar2 != null) {
            aakoVar2.e(ampgVar);
        }
        aako aakoVar3 = aaksVar.c;
        if (aakoVar3 != null) {
            aakoVar3.e(ampgVar);
        }
        aako aakoVar4 = aaksVar.d;
        if (aakoVar4 != null) {
            aakoVar4.e(ampgVar);
        }
        aako aakoVar5 = aaksVar.e;
        if (aakoVar5 != null) {
            aakoVar5.e(ampgVar);
        }
        aako aakoVar6 = aaksVar.f;
        if (aakoVar6 != null) {
            aakoVar6.e(ampgVar);
        }
        aako aakoVar7 = aaksVar.g;
        if (aakoVar7 != null) {
            aakoVar7.e(ampgVar);
        }
        aako aakoVar8 = aaksVar.h;
        if (aakoVar8 != null) {
            aakoVar8.e(ampgVar);
        }
        aako aakoVar9 = aaksVar.i;
        if (aakoVar9 == null) {
            return;
        }
        aakoVar9.e(ampgVar);
    }
}
