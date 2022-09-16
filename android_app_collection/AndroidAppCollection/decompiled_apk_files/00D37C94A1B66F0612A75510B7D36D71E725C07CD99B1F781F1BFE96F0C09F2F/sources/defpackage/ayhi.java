package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;
/* compiled from: PG */
/* renamed from: ayhi  reason: default package */
/* loaded from: classes2.dex */
public final class ayhi extends aydt {
    private static final axzt A;
    public static final ayaq m;
    public Status n;
    public ayat o;
    public Charset p;
    public boolean q;
    public final Object r;
    public final Collection s;
    public boolean t;
    public boolean u;
    public int v;
    public Status w;
    public boolean x;
    public boolean y;
    public final /* synthetic */ aydj z;

    static {
        ayhh ayhhVar = new ayhh();
        A = ayhhVar;
        m = axzu.b(":status", ayhhVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayhi(aydj aydjVar, int i, aymk aymkVar, Object obj, aymt aymtVar) {
        super(i, aymkVar, aymtVar);
        this.z = aydjVar;
        this.p = amoz.c;
        this.s = new ArrayList();
        this.u = false;
        this.r = obj;
    }

    public static Charset g(ayat ayatVar) {
        String str = (String) ayatVar.b(ayhf.f);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return amoz.c;
    }

    public static void h(ayat ayatVar) {
        ayatVar.d(m);
        ayatVar.d(axzv.b);
        ayatVar.d(axzv.a);
    }

    public static final Status i(ayat ayatVar) {
        Integer num = (Integer) ayatVar.b(m);
        if (num == null) {
            return Status.n.withDescription("Missing HTTP status code");
        }
        String str = (String) ayatVar.b(ayhf.f);
        if (ayhf.g(str)) {
            return null;
        }
        Status a = ayhf.a(num.intValue());
        String valueOf = String.valueOf(str);
        return a.a(valueOf.length() != 0 ? "invalid content-type: ".concat(valueOf) : new String("invalid content-type: "));
    }

    @Override // defpackage.ayju
    public final void j(int i) {
        BidirectionalStream bidirectionalStream = this.z.k;
        bidirectionalStream.getClass();
        int i2 = this.v - i;
        this.v = i2;
        if (i2 != 0 || this.x) {
            return;
        }
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // defpackage.ayju
    public final void k(Throwable th) {
        l(Status.b(th), true, new ayat());
    }

    public final void l(Status status, boolean z, ayat ayatVar) {
        BidirectionalStream bidirectionalStream = this.z.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        f(status, z, ayatVar);
    }

    public final void m() {
        aqxo.y(this.i != null);
        synchronized (this.b) {
            aqxo.z(!this.f, "Already allocated");
            this.f = true;
        }
        super.b();
    }
}
