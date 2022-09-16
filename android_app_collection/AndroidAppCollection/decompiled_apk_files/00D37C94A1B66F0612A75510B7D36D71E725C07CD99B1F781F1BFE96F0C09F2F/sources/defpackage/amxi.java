package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amxi  reason: default package */
/* loaded from: classes.dex */
public final class amxi extends amqy {
    private static final long serialVersionUID = 0;
    transient amqo c;

    public amxi(Map map, amqo amqoVar) {
        super(map);
        this.c = amqoVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (amqo) objectInputStream.readObject();
        n((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((amro) this).a);
    }

    @Override // defpackage.amqy, defpackage.amro
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.c.get();
    }

    @Override // defpackage.amro, defpackage.amrv
    public final Map k() {
        Map map = ((amro) this).a;
        if (map instanceof NavigableMap) {
            return new amrf(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new amri(this, (SortedMap) map);
        }
        return new amrb(this, map);
    }

    @Override // defpackage.amro, defpackage.amrv
    public final Set l() {
        Map map = ((amro) this).a;
        if (map instanceof NavigableMap) {
            return new amrg(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new amrj(this, (SortedMap) map);
        }
        return new amre(this, map);
    }
}
