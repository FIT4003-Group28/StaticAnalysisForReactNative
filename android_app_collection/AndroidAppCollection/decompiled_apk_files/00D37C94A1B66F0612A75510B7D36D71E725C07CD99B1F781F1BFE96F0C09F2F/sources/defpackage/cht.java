package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cht  reason: default package */
/* loaded from: classes2.dex */
public final class cht implements chw {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ clb b;

    public cht(ByteBuffer byteBuffer, clb clbVar) {
        this.a = byteBuffer;
        this.b = clbVar;
    }

    @Override // defpackage.chw
    public final int a(chp chpVar) {
        return chpVar.b(this.a, this.b);
    }
}
