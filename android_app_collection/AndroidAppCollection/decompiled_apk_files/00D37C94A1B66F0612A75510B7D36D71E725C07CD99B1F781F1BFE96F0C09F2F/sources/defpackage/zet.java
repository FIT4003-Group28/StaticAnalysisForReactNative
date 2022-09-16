package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: zet  reason: default package */
/* loaded from: classes4.dex */
public final class zet extends zes {
    public final Object b;
    public final zet c;
    private final float d;
    private List e;

    public zet(int i, Object obj, zet zetVar) {
        super(i);
        this.b = obj;
        this.c = zetVar;
        float d = d(zetVar);
        this.d = i != 1 ? d + 1.0f : d;
    }

    public static float d(zet zetVar) {
        if (zetVar != null) {
            return zetVar.d;
        }
        return 0.0f;
    }

    @Override // defpackage.zes
    public final int b() {
        return 1;
    }

    @Override // defpackage.zeu
    public final List e() {
        if (this.e == null) {
            this.e = Collections.singletonList(this.b);
        }
        return this.e;
    }
}
