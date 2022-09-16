package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aikg  reason: default package */
/* loaded from: classes.dex */
public final class aikg implements ynl {
    public String a;
    public volatile boolean c;
    public volatile boolean e;
    public volatile boolean f;
    public volatile int d = 3;
    public volatile AtomicInteger b = new AtomicInteger();
    public volatile boolean g = true;

    public final boolean a() {
        return this.d == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aiik aiikVar = aiik.NAVIGATION;
                aika aikaVar = aika.NEW;
                aiim aiimVar = aiim.START;
                int ordinal = ((ahhw) obj).c().ordinal();
                if (ordinal != 5) {
                    if (ordinal != 8 || !this.c) {
                        return null;
                    }
                    this.b.incrementAndGet();
                    this.c = false;
                    return null;
                }
                this.b.set(0);
                this.c = false;
                return null;
            } else if (i == 1) {
                aiik aiikVar2 = aiik.NAVIGATION;
                aika aikaVar2 = aika.NEW;
                aiim aiimVar2 = aiim.START;
                int ordinal2 = ((aiik) obj).ordinal();
                if (ordinal2 == 0) {
                    this.d = 1;
                    return null;
                } else if (ordinal2 != 1) {
                    return null;
                } else {
                    this.d = 2;
                    return null;
                }
            } else if (i == 2) {
                this.a = ((aiil) obj).a();
                return null;
            } else if (i != 3) {
                if (i == 4) {
                    aiki aikiVar = (aiki) obj;
                    this.b.incrementAndGet();
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            } else {
                aiik aiikVar3 = aiik.NAVIGATION;
                aika aikaVar3 = aika.NEW;
                aiim aiimVar3 = aiim.START;
                switch (((aiin) obj).a().ordinal()) {
                    case 0:
                    case 5:
                        this.g = true;
                        break;
                    case 1:
                    case 2:
                    case 6:
                        this.g = true;
                        this.b.set(0);
                        this.c = false;
                        this.e = false;
                        this.f = false;
                        break;
                    case 3:
                    case 4:
                        this.c = true;
                        this.e = true;
                        this.f = true;
                        break;
                    case 7:
                        this.b.set(0);
                        this.c = false;
                        this.e = false;
                        this.f = false;
                        break;
                }
                if (this.d == 1) {
                    this.d = 2;
                    return null;
                }
                this.d = 3;
                return null;
            }
        }
        return new Class[]{ahhw.class, aiik.class, aiil.class, aiin.class, aiki.class};
    }
}
