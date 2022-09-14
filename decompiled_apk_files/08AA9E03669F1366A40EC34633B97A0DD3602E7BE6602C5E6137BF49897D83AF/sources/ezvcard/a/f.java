package ezvcard.a;

import ezvcard.VCard;
import ezvcard.a.b.as;
import ezvcard.property.Address;
import ezvcard.property.Label;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: StreamReader.java */
/* loaded from: classes.dex */
public abstract class f implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    protected final List<d> f5514a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    protected as f5515b = new as();

    /* renamed from: c  reason: collision with root package name */
    protected c f5516c;

    protected abstract VCard b();

    public VCard a() {
        this.f5514a.clear();
        this.f5516c = new c();
        return b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(VCard vCard, List<Label> list) {
        List<Address> e = vCard.e();
        for (Label label : list) {
            boolean z = true;
            HashSet hashSet = new HashSet(label.getTypes());
            Iterator<Address> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Address next = it.next();
                if (next.getLabel() == null && new HashSet(next.getTypes()).equals(hashSet)) {
                    next.setLabel(label.getValue());
                    z = false;
                    break;
                }
            }
            if (z) {
                vCard.a(label);
            }
        }
    }

    public void a(as asVar) {
        this.f5515b = asVar;
    }

    public List<d> c() {
        return new ArrayList(this.f5514a);
    }
}
