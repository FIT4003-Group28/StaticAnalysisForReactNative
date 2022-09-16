package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aztj  reason: default package */
/* loaded from: classes2.dex */
public final class aztj implements aztg {
    public final aztg a;
    public final azsc b;

    public aztj(aztg aztgVar, azsc azscVar) {
        this.a = aztgVar;
        this.b = azscVar;
    }

    @Override // defpackage.aztg
    public final Iterator a() {
        return new azti(this);
    }
}
