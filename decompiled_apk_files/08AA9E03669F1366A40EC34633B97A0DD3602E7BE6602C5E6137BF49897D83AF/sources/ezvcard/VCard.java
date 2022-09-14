package ezvcard;

import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.FormattedName;
import ezvcard.property.Kind;
import ezvcard.property.Label;
import ezvcard.property.Organization;
import ezvcard.property.StructuredName;
import ezvcard.property.Telephone;
import ezvcard.property.VCardProperty;
import ezvcard.util.g;
import ezvcard.util.h;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class VCard implements Iterable<VCardProperty> {

    /* renamed from: a  reason: collision with root package name */
    private VCardVersion f5453a;

    /* renamed from: b  reason: collision with root package name */
    private final g<Class<? extends VCardProperty>, VCardProperty> f5454b;

    public VCard() {
        this(VCardVersion.V3_0);
    }

    public VCard(VCardVersion vCardVersion) {
        this.f5454b = new g<>();
        this.f5453a = vCardVersion;
    }

    public VCard(VCard vCard) {
        this.f5454b = new g<>();
        this.f5453a = vCard.f5453a;
        for (VCardProperty vCardProperty : vCard.i()) {
            a(vCardProperty.mo226copy());
        }
    }

    public VCardVersion a() {
        return this.f5453a;
    }

    public void a(VCardVersion vCardVersion) {
        this.f5453a = vCardVersion;
    }

    public Kind b() {
        return (Kind) a(Kind.class);
    }

    public FormattedName c() {
        return (FormattedName) a(FormattedName.class);
    }

    public StructuredName d() {
        return (StructuredName) a(StructuredName.class);
    }

    public List<Address> e() {
        return b(Address.class);
    }

    public void a(Label label) {
        a((VCardProperty) label);
    }

    public List<Email> f() {
        return b(Email.class);
    }

    public List<Telephone> g() {
        return b(Telephone.class);
    }

    public Organization h() {
        return (Organization) a(Organization.class);
    }

    @Override // java.lang.Iterable
    public Iterator<VCardProperty> iterator() {
        return this.f5454b.r().iterator();
    }

    public <T extends VCardProperty> T a(Class<T> cls) {
        return cls.cast(this.f5454b.c(cls));
    }

    public <T extends VCardProperty> List<T> b(Class<T> cls) {
        return new a(cls);
    }

    public Collection<VCardProperty> i() {
        return this.f5454b.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(VCardProperty vCardProperty) {
        this.f5454b.a((g<Class<? extends VCardProperty>, VCardProperty>) vCardProperty.getClass(), (Class<?>) vCardProperty);
    }

    public d b(VCardVersion vCardVersion) {
        d dVar = new d();
        if (d() == null && (vCardVersion == VCardVersion.V2_1 || vCardVersion == VCardVersion.V3_0)) {
            dVar.a((VCardProperty) null, new ValidationWarning(0, new Object[0]));
        }
        if (c() == null && (vCardVersion == VCardVersion.V3_0 || vCardVersion == VCardVersion.V4_0)) {
            dVar.a((VCardProperty) null, new ValidationWarning(1, new Object[0]));
        }
        Iterator<VCardProperty> it = iterator();
        while (it.hasNext()) {
            VCardProperty next = it.next();
            List<ValidationWarning> validate = next.validate(vCardVersion, this);
            if (!validate.isEmpty()) {
                dVar.a(next, validate);
            }
        }
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("version=");
        sb.append(this.f5453a);
        for (VCardProperty vCardProperty : this.f5454b.r()) {
            sb.append(h.f5631a);
            sb.append(vCardProperty);
        }
        return sb.toString();
    }

    public int hashCode() {
        int hashCode = (this.f5453a == null ? 0 : this.f5453a.hashCode()) + 31;
        int i = 1;
        for (VCardProperty vCardProperty : this.f5454b.r()) {
            i += vCardProperty.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCard vCard = (VCard) obj;
        if (this.f5453a != vCard.f5453a || this.f5454b.s() != vCard.f5454b.s()) {
            return false;
        }
        Iterator<Map.Entry<Class<? extends VCardProperty>, List<VCardProperty>>> it = this.f5454b.iterator();
        while (it.hasNext()) {
            Map.Entry<Class<? extends VCardProperty>, List<VCardProperty>> next = it.next();
            List<VCardProperty> value = next.getValue();
            List<VCardProperty> b2 = vCard.f5454b.b(next.getKey());
            if (value.size() != b2.size()) {
                return false;
            }
            ArrayList arrayList = new ArrayList(b2);
            for (VCardProperty vCardProperty : value) {
                if (!arrayList.remove(vCardProperty)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a<T extends VCardProperty> extends AbstractList<T> {

        /* renamed from: a  reason: collision with root package name */
        protected final Class<T> f5455a;

        /* renamed from: b  reason: collision with root package name */
        protected final List<VCardProperty> f5456b;

        public a(Class<T> cls) {
            this.f5455a = cls;
            this.f5456b = VCard.this.f5454b.b(cls);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public void add(int i, T t) {
            this.f5456b.add(i, t);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public T remove(int i) {
            return a(this.f5456b.remove(i));
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public T get(int i) {
            return a(this.f5456b.get(i));
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public T set(int i, T t) {
            return a(this.f5456b.set(i, t));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f5456b.size();
        }

        private T a(VCardProperty vCardProperty) {
            return this.f5455a.cast(vCardProperty);
        }
    }
}
