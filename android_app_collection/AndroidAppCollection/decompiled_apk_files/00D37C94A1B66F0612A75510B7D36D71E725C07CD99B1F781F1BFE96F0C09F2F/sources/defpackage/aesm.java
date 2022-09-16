package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aesm  reason: default package */
/* loaded from: classes.dex */
public class aesm {
    public final aerw a;
    public final AtomicInteger b;
    public boolean c;
    public volatile Integer d;
    public Long e;
    public int f;
    private final aesh g;
    private final Handler h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private List n;
    private boolean o;

    public aesm(aesh aeshVar, Handler handler, aerw aerwVar) {
        afms.a(aeshVar);
        this.g = aeshVar;
        this.h = handler;
        afms.a(aerwVar);
        this.a = aerwVar;
        this.b = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amuk c() {
        List list = this.n;
        if (list == null) {
            return null;
        }
        return amuk.o(list);
    }

    public final void d(List list, final int i) {
        if (!list.contains(3) || this.o) {
            return;
        }
        this.h.post(new Runnable() { // from class: aesl
            @Override // java.lang.Runnable
            public final void run() {
                aesm aesmVar = aesm.this;
                int i2 = i;
                if (i2 == 0 || i2 == aesmVar.b.get()) {
                    aesmVar.a.rv();
                }
            }
        });
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(String str, String str2, String str3, String str4, String str5) {
        this.i = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.j = str5;
        this.o = false;
        this.b.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [aesg] */
    public final byte[] f(byte[] bArr) {
        aerz aerzVar;
        int i = this.b.get();
        String str = this.i;
        Uri parse = str != null ? Uri.parse(str) : null;
        aesh aeshVar = this.g;
        String str2 = this.m;
        String str3 = this.j;
        String str4 = this.k;
        String str5 = this.l;
        Integer num = this.d;
        int i2 = this.f;
        Long l = this.e;
        if (parse != null) {
            ylr.b();
            zgp b = zgp.b(parse);
            aeshVar.b.d(b);
            b.h("cpn", str3);
            if (!str4.equals("")) {
                b.h("session_id", str4);
            }
            Uri a = b.a();
            afze d = afze.d();
            aesd aesdVar = new aesd(aeshVar.g, a.toString(), bArr, aeshVar.i, aeshVar.a.c(), aeshVar.c, d);
            aesdVar.h = false;
            aeshVar.f.a(aesdVar);
            try {
                aerzVar = (aesg) d.get();
            } catch (InterruptedException e) {
                throw new aesf(e);
            } catch (ExecutionException e2) {
                if (e2.getCause() instanceof aesf) {
                    throw ((aesf) e2.getCause());
                }
                throw new aesf(e2.getCause());
            }
        } else {
            afms.d(!str5.isEmpty());
            ylr.b();
            try {
                aerz aerzVar2 = new aerz((arqz) aeshVar.j.d(new aesa(aeshVar.e, aeshVar.a, bArr, str2, str3, TextUtils.isEmpty(str4) ? aeshVar.h.a() : str4, str5, num, i2, l)));
                boolean e3 = aerzVar2.e();
                aerzVar = aerzVar2;
                if (!e3) {
                    throw new aesf(aerzVar2);
                }
            } catch (aart e4) {
                throw new aesf(e4);
            }
        }
        this.n = aerzVar.a();
        this.c = aerzVar.c();
        if (i == this.b.get() && this.h != null) {
            d(this.n, i);
        }
        return aerzVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] g(String str, byte[] bArr) {
        Uri parse = Uri.parse(str);
        aesh aeshVar = this.g;
        String str2 = this.j;
        ylr.b();
        zgp b = zgp.b(parse);
        b.h("signedRequest", new String(bArr));
        b.h("cpn", str2);
        aeshVar.b.d(b);
        Uri a = b.a();
        afze d = afze.d();
        aeshVar.f.a(new aesb(a.toString(), d));
        try {
            return (byte[]) d.get();
        } catch (InterruptedException e) {
            throw new aesf(e, true);
        } catch (ExecutionException e2) {
            throw new aesf(e2.getCause(), true);
        }
    }
}
