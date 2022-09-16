package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
/* compiled from: PG */
/* renamed from: tbp  reason: default package */
/* loaded from: classes4.dex */
public final class tbp extends teb {
    private final azqb a;

    public tbp(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.teb
    public final void a(int i, String str, tda tdaVar, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        aopa createBuilder = aorw.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).b = currentTimeMillis / 1000;
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).c = (int) ((currentTimeMillis % 1000) * 1000000);
        aorw aorwVar = (aorw) createBuilder.mo39build();
        int i2 = i == 12 ? 3 : 4;
        aopa createBuilder2 = awqu.a.createBuilder();
        createBuilder2.copyOnWrite();
        awqu awquVar = (awqu) createBuilder2.instance;
        awquVar.e = i2 - 1;
        awquVar.b |= 4;
        createBuilder2.copyOnWrite();
        awqu awquVar2 = (awqu) createBuilder2.instance;
        awquVar2.b |= 8;
        awquVar2.f = awwc.G(i);
        createBuilder2.copyOnWrite();
        awqu awquVar3 = (awqu) createBuilder2.instance;
        str.getClass();
        awquVar3.b |= 1;
        awquVar3.c = str;
        createBuilder2.copyOnWrite();
        awqu awquVar4 = (awqu) createBuilder2.instance;
        aorwVar.getClass();
        awquVar4.d = aorwVar;
        awquVar4.b |= 2;
        if (th != null) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append('\n');
            sb.append(valueOf);
            String sb2 = sb.toString();
            createBuilder2.copyOnWrite();
            awqu awquVar5 = (awqu) createBuilder2.instance;
            sb2.getClass();
            awquVar5.b |= 1;
            awquVar5.c = sb2;
            aopa createBuilder3 = awqv.a.createBuilder();
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                aopa createBuilder4 = awqs.a.createBuilder();
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                StringBuilder sb3 = new StringBuilder(String.valueOf(className).length() + 1 + String.valueOf(methodName).length());
                sb3.append(className);
                sb3.append(".");
                sb3.append(methodName);
                String sb4 = sb3.toString();
                createBuilder4.copyOnWrite();
                awqs awqsVar = (awqs) createBuilder4.instance;
                sb4.getClass();
                awqsVar.b |= 1;
                awqsVar.c = sb4;
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber >= 0) {
                    createBuilder4.copyOnWrite();
                    awqs awqsVar2 = (awqs) createBuilder4.instance;
                    awqsVar2.b |= 4;
                    awqsVar2.e = lineNumber;
                }
                String fileName = stackTraceElement.getFileName();
                if (fileName != null) {
                    createBuilder4.copyOnWrite();
                    awqs awqsVar3 = (awqs) createBuilder4.instance;
                    awqsVar3.b |= 2;
                    awqsVar3.d = fileName;
                }
                awqs awqsVar4 = (awqs) createBuilder4.mo39build();
                createBuilder3.copyOnWrite();
                awqv awqvVar = (awqv) createBuilder3.instance;
                awqsVar4.getClass();
                aopu aopuVar = awqvVar.b;
                if (!aopuVar.c()) {
                    awqvVar.b = aopi.mutableCopy(aopuVar);
                }
                awqvVar.b.add(awqsVar4);
            }
            awqv awqvVar2 = (awqv) createBuilder3.mo39build();
            createBuilder2.copyOnWrite();
            awqu awquVar6 = (awqu) createBuilder2.instance;
            awqvVar2.getClass();
            awquVar6.g = awqvVar2;
            awquVar6.b |= 16;
        }
        ((DebuggerClient) this.a.get()).sendLog(((awqu) createBuilder2.mo39build()).toByteArray());
    }
}
