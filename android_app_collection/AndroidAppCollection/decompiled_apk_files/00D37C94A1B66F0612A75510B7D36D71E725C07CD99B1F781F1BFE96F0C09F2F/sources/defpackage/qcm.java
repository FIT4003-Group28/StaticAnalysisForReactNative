package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qcm  reason: default package */
/* loaded from: classes4.dex */
public final class qcm {
    private static qcm b;
    public final pzh a = new pzh(new ArrayList());

    private qcm() {
        new ArrayList();
    }

    public static qcm a() {
        qcm qcmVar;
        synchronized (qcm.class) {
            if (b == null) {
                b = new qcm();
            }
            qcmVar = b;
        }
        return qcmVar;
    }
}
