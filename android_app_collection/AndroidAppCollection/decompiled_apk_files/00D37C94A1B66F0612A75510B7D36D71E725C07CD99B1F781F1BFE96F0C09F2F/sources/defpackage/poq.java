package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: poq  reason: default package */
/* loaded from: classes4.dex */
public final class poq extends poo {
    public static final EventMessage c(pwu pwuVar) {
        String t = pwuVar.t();
        ptx.a(t);
        String t2 = pwuVar.t();
        ptx.a(t2);
        return new EventMessage(t, t2, pwuVar.o(), pwuVar.o(), Arrays.copyOfRange(pwuVar.a, pwuVar.b, pwuVar.c));
    }

    @Override // defpackage.poo
    protected final Metadata b(pol polVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new pwu(byteBuffer.array(), byteBuffer.limit())));
    }
}
