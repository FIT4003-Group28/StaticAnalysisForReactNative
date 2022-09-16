package defpackage;
/* compiled from: PG */
/* renamed from: qyh  reason: default package */
/* loaded from: classes7.dex */
public class qyh {
    public static final boolean a(@dzsi qvb qvbVar) {
        quy quyVar = ((qun) qvbVar).a;
        if (quyVar == null) {
            return false;
        }
        azva d = quyVar.d();
        if (d != null && d.a == dndr.INFERRED_HOME) {
            return true;
        }
        azva e = quyVar.e();
        return e != null && e.a == dndr.INFERRED_WORK;
    }
}
