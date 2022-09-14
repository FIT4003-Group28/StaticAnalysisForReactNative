package defpackage;
/* compiled from: PG */
/* renamed from: deag  reason: default package */
/* loaded from: classes6.dex */
public final class deag {
    public static ddzb a(Throwable th) {
        ddzb bZ = ddzc.d.bZ();
        ddyx b = b(th);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzc ddzcVar = (ddzc) bZ.b;
        ddza bK = b.bK();
        bK.getClass();
        ddzcVar.b = bK;
        ddzcVar.a |= 1;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null || cause == th) {
                break;
            }
            ddyx b2 = b(th.getCause());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzc ddzcVar2 = (ddzc) bZ.b;
            ddza bK2 = b2.bK();
            bK2.getClass();
            dsrj<ddza> dsrjVar = ddzcVar2.c;
            if (!dsrjVar.a()) {
                ddzcVar2.c = dsqw.cl(dsrjVar);
            }
            ddzcVar2.c.add(bK2);
            th = th.getCause();
        }
        return bZ;
    }

    private static ddyx b(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        ddyx bZ = ddza.d.bZ();
        String name = th.getClass().getName();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddza ddzaVar = (ddza) bZ.b;
        name.getClass();
        ddzaVar.a |= 1;
        ddzaVar.b = name;
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                ddyy bZ2 = ddyz.f.bZ();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddyz ddyzVar = (ddyz) bZ2.b;
                    className.getClass();
                    ddyzVar.a |= 1;
                    ddyzVar.b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddyz ddyzVar2 = (ddyz) bZ2.b;
                    methodName.getClass();
                    ddyzVar2.a |= 2;
                    ddyzVar2.c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddyz ddyzVar3 = (ddyz) bZ2.b;
                    ddyzVar3.a |= 8;
                    ddyzVar3.e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddyz ddyzVar4 = (ddyz) bZ2.b;
                        fileName.getClass();
                        ddyzVar4.a |= 4;
                        ddyzVar4.d = fileName;
                    }
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddza ddzaVar2 = (ddza) bZ.b;
                ddyz bK = bZ2.bK();
                bK.getClass();
                dsrj<ddyz> dsrjVar = ddzaVar2.c;
                if (!dsrjVar.a()) {
                    ddzaVar2.c = dsqw.cl(dsrjVar);
                }
                ddzaVar2.c.add(bK);
            }
        }
        return bZ;
    }
}
