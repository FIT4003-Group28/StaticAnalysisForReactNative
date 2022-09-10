package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azrv  reason: default package */
/* loaded from: classes3.dex */
public abstract class azrv implements Serializable {
    @dzsi
    private transient axuc a = null;

    public static azru q() {
        azro azroVar = new azro();
        azroVar.l(false);
        return azroVar;
    }

    public abstract dndr a();

    public abstract String b();

    public abstract boolean c();

    public abstract boolean d();

    @dzsi
    public abstract ddho e();

    @dzsi
    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    @dzsi
    public abstract akqq k();

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public abstract byte[] l();

    @dzsi
    public abstract anee m();

    public abstract boolean n();

    public abstract azru o();

    @dzsi
    public final axuc p(bwqv bwqvVar) {
        axuc axucVar = this.a;
        if (axucVar != null) {
            return axucVar;
        }
        byte[] l = l();
        if (l == null) {
            return null;
        }
        int length = l.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(l, 0, length);
        obtain.setDataPosition(0);
        try {
            axuc axucVar2 = (axuc) bwqvVar.d(axuc.class, (Bundle) Bundle.CREATOR.createFromParcel(obtain), "serializableAliasFlowData");
            this.a = axucVar2;
            return axucVar2;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
