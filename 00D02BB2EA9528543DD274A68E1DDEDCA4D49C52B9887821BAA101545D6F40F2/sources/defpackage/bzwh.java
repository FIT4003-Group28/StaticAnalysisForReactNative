package defpackage;

import android.app.Application;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
@Deprecated
/* renamed from: bzwh  reason: default package */
/* loaded from: classes.dex */
public final class bzwh<T extends Serializable> {
    private static final dcqe b = dcqe.c("bzwh");
    public final bwsa a;
    private final Application c;
    private final String d;
    private final Class<T> e;
    @dzsi
    private final auub f;

    public bzwh(Application application, bwsa bwsaVar, String str, Class cls, auub auubVar) {
        this.c = application;
        this.a = bwsaVar;
        this.d = str;
        this.e = cls;
        this.f = auubVar;
    }

    private final byte[] e() {
        return decn.e(bvoc.c(this.c));
    }

    @dzsi
    public final T a() {
        byte[] a = this.a.a(d());
        if (a == null) {
            auub auubVar = this.f;
            if (auubVar != null) {
                auubVar.a(null);
            }
            return null;
        } else if (!Arrays.equals(a, e())) {
            auub auubVar2 = this.f;
            if (auubVar2 != null) {
                ((ckco) auubVar2.a.a(ckht.P)).a(ckhr.a(3));
            }
            return null;
        } else {
            byte[] a2 = this.a.a(c());
            if (a2 == null) {
                auub auubVar3 = this.f;
                if (auubVar3 != null) {
                    auubVar3.a(null);
                }
                return null;
            }
            try {
                T cast = this.e.cast(new ObjectInputStream(new ByteArrayInputStream(a2)).readObject());
                auub auubVar4 = this.f;
                if (auubVar4 != null) {
                    auubVar4.a(cast);
                }
                return cast;
            } catch (IOException | ArrayIndexOutOfBoundsException | ClassCastException | ClassNotFoundException unused) {
                auub auubVar5 = this.f;
                if (auubVar5 != null) {
                    ((ckco) auubVar5.a.a(ckht.P)).a(ckhr.a(4));
                }
                return null;
            }
        }
    }

    public final void b(T t) {
        try {
            this.a.b(d());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                new ObjectOutputStream(byteArrayOutputStream).writeObject(t);
                this.a.d(byteArrayOutputStream.toByteArray(), c());
                this.a.d(e(), d());
            } catch (IOException e) {
                bvoo.h("Object was not serializable %s", e);
                throw e;
            }
        } catch (IOException unused) {
        }
    }

    public final String c() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "ShortTermStorage_".concat(valueOf) : new String("ShortTermStorage_");
    }

    public final String d() {
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("ShortTermStorage_");
        sb.append(str);
        sb.append("_Version");
        return sb.toString();
    }
}
