package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dckq  reason: default package */
/* loaded from: classes5.dex */
public final class dckq<K, V> extends dbxj<K, V> {
    private static final long serialVersionUID = 0;
    transient dbty<? extends List<V>> c;

    public dckq(Map<K, Collection<V>> map, dbty<? extends List<V>> dbtyVar) {
        super(map);
        this.c = dbtyVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (dbty) objectInputStream.readObject();
        j((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((dbye) this).a);
    }

    @Override // defpackage.dbxj, defpackage.dbye
    public final /* bridge */ /* synthetic */ Collection h() {
        return this.c.a();
    }

    @Override // defpackage.dbye, defpackage.dbyn
    public final Set<K> r() {
        return s();
    }

    @Override // defpackage.dbye, defpackage.dbyn
    public final Map<K, Collection<V>> x() {
        return y();
    }
}
