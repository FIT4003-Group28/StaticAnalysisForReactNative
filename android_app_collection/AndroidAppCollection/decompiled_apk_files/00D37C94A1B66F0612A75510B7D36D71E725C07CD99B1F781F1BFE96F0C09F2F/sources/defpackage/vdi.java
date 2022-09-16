package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: vdi  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vdi implements vdk {
    public final /* synthetic */ vdk a;
    private final /* synthetic */ int b;

    public /* synthetic */ vdi(vdk vdkVar, int i) {
        this.b = i;
        this.a = vdkVar;
    }

    @Override // defpackage.vdk
    public final Object a(Object obj) {
        if (this.b == 0) {
            return this.a.a(Base64.decode((String) obj, 3));
        }
        return this.a.a((byte[]) obj);
    }
}
