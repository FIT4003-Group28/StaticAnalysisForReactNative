package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: tap  reason: default package */
/* loaded from: classes4.dex */
public final class tap implements tfh {
    private static final aoos f;
    private static final awnf g;
    private static final awnf h;
    public final azqb a;
    public final Context b;
    public final boolean c;
    public final azqb d;
    public final azqb e;

    static {
        aoos c = aoos.c();
        c.e(awoy.b);
        f = c;
        aopa createBuilder = awnf.a.createBuilder();
        createBuilder.copyOnWrite();
        awnf awnfVar = (awnf) createBuilder.instance;
        awnfVar.b = 8;
        awnfVar.c = 0;
        g = (awnf) createBuilder.mo39build();
        aopa createBuilder2 = awnf.a.createBuilder();
        createBuilder2.copyOnWrite();
        awnf awnfVar2 = (awnf) createBuilder2.instance;
        awnfVar2.b = 8;
        awnfVar2.c = 1;
        h = (awnf) createBuilder2.mo39build();
    }

    public tap(Context context, ampq ampqVar, ampq ampqVar2, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.b = context;
        this.c = ((Boolean) ampqVar.e(false)).booleanValue();
        this.a = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        if (((Boolean) ampqVar2.e(false)).booleanValue()) {
            azqbVar.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(byte[] bArr) {
        try {
            return ((awoy) ((awos) aopi.parseFrom(awos.a, bArr, f)).qm(awoy.b)).d;
        } catch (aopx unused) {
            return "Unknown template";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer b(Context context, tet tetVar) {
        try {
            if (tetVar.c) {
                aopa createBuilder = awne.a.createBuilder((awne) aopi.parseFrom(awne.a, tetVar.f(), aoos.a()));
                createBuilder.aY("/system/orientation", context.getResources().getConfiguration().orientation == 2 ? g : h);
                aopc aopcVar = (aopc) awnc.a.createBuilder();
                aopcVar.e(awne.b, (awne) createBuilder.mo39build());
                return ByteBuffer.wrap(((awnc) aopcVar.mo39build()).toByteArray());
            }
            return tetVar.e();
        } catch (aopx e) {
            throw new ted("Failed to deserialize Model", e);
        }
    }

    @Override // defpackage.tfh
    public final tfg c(byte[] bArr, aodt aodtVar, String str) {
        return new tao(this, bArr, aodtVar, str);
    }
}
