package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmcd  reason: default package */
/* loaded from: classes5.dex */
public final class cmcd extends cmbz {
    @Override // defpackage.cmbz
    protected final Metadata b(cmbw cmbwVar, ByteBuffer byteBuffer) {
        cmnk cmnkVar = new cmnk(byteBuffer.array(), byteBuffer.limit());
        String B = cmnkVar.B();
        cmmn.f(B);
        String B2 = cmnkVar.B();
        cmmn.f(B2);
        return new Metadata(new EventMessage(B, B2, cmnkVar.p(), cmnkVar.p(), Arrays.copyOfRange(cmnkVar.a, cmnkVar.b, cmnkVar.c)));
    }
}
