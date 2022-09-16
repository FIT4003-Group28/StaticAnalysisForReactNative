package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: afxv  reason: default package */
/* loaded from: classes.dex */
public final class afxv extends afxj {
    private final yqh c;

    public afxv(yqh yqhVar, aftr aftrVar, aftk aftkVar) {
        super(aftrVar, aftkVar);
        yqhVar.getClass();
        this.c = yqhVar;
    }

    private static final void d(yrb yrbVar) {
        yqz yqzVar = yrbVar.d;
        if (yqzVar != null) {
            yqzVar.f();
        }
    }

    @Override // defpackage.afxj
    protected final /* bridge */ /* synthetic */ void b(Object obj, yiw yiwVar) {
        yqv yqvVar = (yqv) obj;
        yqvVar.getClass();
        yrb yrbVar = null;
        try {
            try {
                yrbVar = this.c.a(yqvVar);
                yiwVar.b(yqvVar, yrbVar);
                if (yrbVar == null) {
                    return;
                }
                try {
                    d(yrbVar);
                } catch (IOException e) {
                    zep.n("Error consuming content response", e);
                }
            } catch (Throwable th) {
                if (yrbVar != null) {
                    try {
                        d(yrbVar);
                    } catch (IOException e2) {
                        zep.n("Error consuming content response", e2);
                    }
                }
                throw th;
            }
        } catch (IllegalStateException e3) {
            yiwVar.a(yqvVar, e3);
            if (yrbVar == null) {
                return;
            }
            try {
                d(yrbVar);
            } catch (IOException e4) {
                zep.n("Error consuming content response", e4);
            }
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception e6) {
            yiwVar.a(yqvVar, e6);
            if (yrbVar == null) {
                return;
            }
            try {
                d(yrbVar);
            } catch (IOException e7) {
                zep.n("Error consuming content response", e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afxj
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2, yiw yiwVar, Exception exc) {
        yqv yqvVar = (yqv) obj2;
        if (exc instanceof yrc) {
            yqvVar.a.length();
            int i = ((yrc) exc).a;
            String message = exc.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
            sb.append("Http error: status=[");
            sb.append(i);
            sb.append("] msg=[");
            sb.append(message);
            sb.append("]");
            zep.b(sb.toString());
        }
        super.c(obj, yqvVar, yiwVar, exc);
    }
}
