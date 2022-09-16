package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: sxq  reason: default package */
/* loaded from: classes4.dex */
public final class sxq implements sxr {
    private final tcu a;
    private final tfy b;
    private final /* synthetic */ int c;

    public sxq(tcu tcuVar, tfy tfyVar) {
        this.a = tcuVar;
        this.b = tfyVar;
    }

    public sxq(tcu tcuVar, tfy tfyVar, int i) {
        this.c = i;
        this.a = tcuVar;
        this.b = tfyVar;
    }

    @Override // defpackage.sxr
    public final int a() {
        return this.c != 0 ? 334827261 : 336816453;
    }

    @Override // defpackage.sxr
    public final /* bridge */ /* synthetic */ IntersectionObserver b(aodt aodtVar, tcs tcsVar) {
        if (this.c == 0) {
            return new sxp((axmx) aodtVar, this.a, tcsVar, this.b);
        }
        return new sxn((axms) aodtVar, this.a, tcsVar, this.b);
    }

    @Override // defpackage.sxr
    public final /* bridge */ /* synthetic */ aodt c(aodt aodtVar) {
        if (this.c == 0) {
            ByteBuffer V = aodtVar.V();
            axmx axmxVar = new axmx();
            V.order(ByteOrder.LITTLE_ENDIAN);
            axmxVar.f(V.getInt(V.position()) + V.position(), V);
            return axmxVar;
        }
        ByteBuffer V2 = aodtVar.V();
        axms axmsVar = new axms();
        V2.order(ByteOrder.LITTLE_ENDIAN);
        axmsVar.f(V2.getInt(V2.position()) + V2.position(), V2);
        return axmsVar;
    }
}
