package defpackage;
/* compiled from: PG */
/* renamed from: daq  reason: default package */
/* loaded from: classes3.dex */
public class daq {
    public dbb a;
    public final int b;
    public final Object[] c;

    /* JADX INFO: Access modifiers changed from: protected */
    public daq(dbb dbbVar) {
        this(dbbVar, -1, null);
    }

    public daq(dbb dbbVar, int i, Object[] objArr) {
        this.a = dbbVar;
        this.b = i;
        this.c = objArr;
    }

    public void a(Object obj) {
        this.a.l().K(this, obj);
    }

    public boolean b(daq daqVar) {
        if (this == daqVar) {
            return true;
        }
        if (daqVar == null || daqVar.getClass() != getClass() || this.b != daqVar.b) {
            return false;
        }
        Object[] objArr = this.c;
        Object[] objArr2 = daqVar.c;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int i = 1;
        while (true) {
            Object[] objArr3 = this.c;
            if (i >= objArr3.length) {
                return true;
            }
            Object obj = objArr3[i];
            Object obj2 = daqVar.c[i];
            if (obj == null) {
                if (obj2 != null) {
                    break;
                }
                i++;
            } else if (!obj.equals(obj2)) {
                break;
            } else {
                i++;
            }
        }
        return false;
    }
}
