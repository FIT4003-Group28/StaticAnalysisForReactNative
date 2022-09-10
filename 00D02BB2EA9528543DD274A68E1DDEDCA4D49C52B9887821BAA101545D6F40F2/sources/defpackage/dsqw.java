package defpackage;

import defpackage.dsqp;
import defpackage.dsqw;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: dsqw  reason: default package */
/* loaded from: classes.dex */
public abstract class dsqw<MessageType extends dsqw<MessageType, BuilderType>, BuilderType extends dsqp<MessageType, BuilderType>> extends dsoe<MessageType, BuilderType> {
    public static final Map<Object, dsqw<?, ?>> bF = new ConcurrentHashMap();
    protected dsty bD = dsty.a;
    public int bE = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends dsqw> void cc(Class<T> cls, T t) {
        bF.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object cd(dssj dssjVar, String str, Object[] objArr) {
        return new dssv(dssjVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object ce(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static dsrf cf() {
        return dsqz.b;
    }

    public static dsrf cg(dsrf dsrfVar) {
        int size = dsrfVar.size();
        return dsrfVar.d(size == 0 ? 10 : size + size);
    }

    public static dsri ch() {
        return dsrx.b;
    }

    public static dsri ci(dsri dsriVar) {
        int size = dsriVar.size();
        return dsriVar.f(size == 0 ? 10 : size + size);
    }

    public static dsre cj(dsre dsreVar) {
        int size = dsreVar.size();
        return dsreVar.d(size == 0 ? 10 : size + size);
    }

    public static <E> dsrj<E> ck() {
        return dssu.b;
    }

    public static <E> dsrj<E> cl(dsrj<E> dsrjVar) {
        int size = dsrjVar.size();
        return dsrjVar.e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends dsqw<T, ?>> T cm(T t, dspj dspjVar, dsqa dsqaVar) {
        T t2 = (T) t.cu(4);
        try {
            dstc b = dsst.a.b(t2);
            b.f(t2, dspk.n(dspjVar), dsqaVar);
            b.j(t2);
            return t2;
        } catch (IOException e) {
            if (!(e.getCause() instanceof dsrm)) {
                throw new dsrm(e.getMessage());
            }
            throw ((dsrm) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof dsrm) {
                throw ((dsrm) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends dsqw<T, ?>> T cn(T t, byte[] bArr, int i, int i2, dsqa dsqaVar) {
        T t2 = (T) t.cu(4);
        try {
            dstc b = dsst.a.b(t2);
            b.i(t2, bArr, i, i + i2, new dsol(dsqaVar));
            b.j(t2);
            if (t2.bC == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (!(e.getCause() instanceof dsrm)) {
                throw new dsrm(e.getMessage());
            }
            throw ((dsrm) e.getCause());
        } catch (IndexOutOfBoundsException unused) {
            throw dsrm.a();
        }
    }

    public static <T extends dsqw<T, ?>> T co(T t, ByteBuffer byteBuffer) {
        dsqa b = dsqa.b();
        dspj K = dspj.K(byteBuffer);
        T t2 = (T) t.cu(4);
        try {
            dstc b2 = dsst.a.b(t2);
            b2.f(t2, dspk.n(K), b);
            b2.j(t2);
            cv(t2);
            cv(t2);
            return t2;
        } catch (IOException e) {
            if (!(e.getCause() instanceof dsrm)) {
                throw new dsrm(e.getMessage());
            }
            throw ((dsrm) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof dsrm) {
                throw ((dsrm) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends dsqw<T, ?>> T cp(T t, dspd dspdVar) {
        dsqa b = dsqa.b();
        try {
            dspj s = dspdVar.s();
            T t2 = (T) t.cu(4);
            try {
                try {
                    dstc b2 = dsst.a.b(t2);
                    b2.f(t2, dspk.n(s), b);
                    b2.j(t2);
                    try {
                        s.b(0);
                        cv(t2);
                        cv(t2);
                        return t2;
                    } catch (dsrm e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof dsrm) {
                        throw ((dsrm) e2.getCause());
                    }
                    throw new dsrm(e2.getMessage());
                }
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof dsrm) {
                    throw ((dsrm) e3.getCause());
                }
                throw e3;
            }
        } catch (dsrm e4) {
            throw e4;
        }
    }

    public static <T extends dsqw<T, ?>> T cq(T t, byte[] bArr) {
        T t2 = (T) cn(t, bArr, 0, bArr.length, dsqa.b());
        cv(t2);
        return t2;
    }

    public static <T extends dsqw<T, ?>> T cr(T t, byte[] bArr, dsqa dsqaVar) {
        T t2 = (T) cn(t, bArr, 0, bArr.length, dsqaVar);
        cv(t2);
        return t2;
    }

    public static <T extends dsqw<T, ?>> T cs(T t, InputStream inputStream, dsqa dsqaVar) {
        dspj I = dspj.I(inputStream);
        T t2 = (T) t.cu(4);
        try {
            dstc b = dsst.a.b(t2);
            b.f(t2, dspk.n(I), dsqaVar);
            b.j(t2);
            cv(t2);
            return t2;
        } catch (IOException e) {
            if (!(e.getCause() instanceof dsrm)) {
                throw new dsrm(e.getMessage());
            }
            throw ((dsrm) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof dsrm) {
                throw ((dsrm) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends dsqw<T, ?>> T ct(T t, InputStream inputStream) {
        T t2;
        dsqa b = dsqa.b();
        try {
            int read = inputStream.read();
            if (read == -1) {
                t2 = null;
            } else {
                dspj I = dspj.I(new dsoc(inputStream, dspj.N(read, inputStream)));
                t2 = (T) t.cu(4);
                try {
                    dstc b2 = dsst.a.b(t2);
                    b2.f(t2, dspk.n(I), b);
                    b2.j(t2);
                    try {
                        I.b(0);
                    } catch (dsrm e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof dsrm) {
                        throw ((dsrm) e2.getCause());
                    }
                    throw new dsrm(e2.getMessage());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof dsrm) {
                        throw ((dsrm) e3.getCause());
                    }
                    throw e3;
                }
            }
            cv(t2);
            return t2;
        } catch (IOException e4) {
            throw new dsrm(e4.getMessage());
        }
    }

    public static <T extends dsqw<T, ?>> void cv(T t) {
        if (t == null || t.Qv()) {
            return;
        }
        throw bX().a();
    }

    public static dsqe fieldInfoForProto2Optional(Field field, int i, dsqj dsqjVar, Field field2, int i2, boolean z, dsrd dsrdVar) {
        if (field == null || field2 == null) {
            return null;
        }
        dsqe.a(i);
        dsrk.i(field, "field");
        dsrk.i(dsqjVar, "fieldType");
        dsrk.i(field2, "presenceField");
        if (dsqe.b(i2)) {
            return new dsqe(i);
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("presenceMask must have exactly one bit set: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static dsqe fieldInfoForProto2Required(Field field, int i, dsqj dsqjVar, Field field2, int i2, boolean z, dsrd dsrdVar) {
        if (field == null || field2 == null) {
            return null;
        }
        dsqe.a(i);
        dsrk.i(field, "field");
        dsrk.i(dsqjVar, "fieldType");
        dsrk.i(field2, "presenceField");
        if (dsqe.b(i2)) {
            return new dsqe(i);
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("presenceMask must have exactly one bit set: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <ContainingType extends dssj, Type> dsqv<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, dssj dssjVar, dsrc dsrcVar, int i, dsur dsurVar, boolean z, Class cls) {
        return new dsqv<>(containingtype, Collections.emptyList(), dssjVar, new dsqu(dsrcVar, i, dsurVar, true, z));
    }

    public static <ContainingType extends dssj, Type> dsqv<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, dssj dssjVar, dsrc dsrcVar, int i, dsur dsurVar, Class cls) {
        return new dsqv<>(containingtype, type, dssjVar, new dsqu(dsrcVar, i, dsurVar, false, false));
    }

    @Override // defpackage.dssj
    public final /* bridge */ /* synthetic */ dssi NH() {
        return (dsqp) cu(5);
    }

    @Override // defpackage.dssj
    public final /* bridge */ /* synthetic */ dssi Nn() {
        dsqp dsqpVar = (dsqp) cu(5);
        dsqpVar.bC(this);
        return dsqpVar;
    }

    protected abstract Object OK(int i, Object obj);

    @Override // defpackage.dssj
    public final void Pv(dspp dsppVar) {
        dstc b = dsst.a.b(this);
        dspq dspqVar = dsppVar.f;
        if (dspqVar == null) {
            dspqVar = new dspq(dsppVar);
        }
        b.n(this, dspqVar);
    }

    @Override // defpackage.dssk
    public final boolean Qv() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) cu(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean k = dsst.a.b(this).k(this);
        if (!booleanValue) {
            return k;
        }
        OK(2, true != k ? null : this);
        return k;
    }

    @Override // defpackage.dssk
    public final /* bridge */ /* synthetic */ dssj Qw() {
        return (dsqw) cu(6);
    }

    @Override // defpackage.dsoe
    public final int bV() {
        return this.bE;
    }

    @Override // defpackage.dsoe
    public final void bW(int i) {
        this.bE = i;
    }

    @Override // defpackage.dssj
    public final dssr<MessageType> bY() {
        return (dssr) cu(7);
    }

    public final <MessageType extends dsqw<MessageType, BuilderType>, BuilderType extends dsqp<MessageType, BuilderType>> BuilderType bZ() {
        return (BuilderType) cu(5);
    }

    public final <MessageType extends dsqw<MessageType, BuilderType>, BuilderType extends dsqp<MessageType, BuilderType>> BuilderType ca(MessageType messagetype) {
        BuilderType bZ = bZ();
        bZ.bC(messagetype);
        return bZ;
    }

    @Override // defpackage.dssj
    public final int cb() {
        int i = this.bE;
        if (i == -1) {
            int e = dsst.a.b(this).e(this);
            this.bE = e;
            return e;
        }
        return i;
    }

    public final Object cu(int i) {
        return OK(i, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return dsst.a.b(this).b(this, (dsqw) obj);
    }

    public final int hashCode() {
        int i = this.bC;
        if (i != 0) {
            return i;
        }
        int c = dsst.a.b(this).c(this);
        this.bC = c;
        return c;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        dssl.a(this, sb, 0);
        return sb.toString();
    }
}
