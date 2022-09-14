package ezvcard;

import ezvcard.property.VCardProperty;
import ezvcard.util.g;
import ezvcard.util.h;
import java.text.NumberFormat;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ValidationWarnings.java */
/* loaded from: classes.dex */
public class d implements Iterable<Map.Entry<VCardProperty, List<ValidationWarning>>> {

    /* renamed from: a  reason: collision with root package name */
    private final g<VCardProperty, ValidationWarning> f5520a = new g<>(new IdentityHashMap());

    public void a(VCardProperty vCardProperty, ValidationWarning validationWarning) {
        this.f5520a.a((g<VCardProperty, ValidationWarning>) vCardProperty, (VCardProperty) validationWarning);
    }

    public void a(VCardProperty vCardProperty, List<ValidationWarning> list) {
        this.f5520a.a((g<VCardProperty, ValidationWarning>) vCardProperty, list);
    }

    public String toString() {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setMinimumIntegerDigits(2);
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<VCardProperty, List<ValidationWarning>>> it = this.f5520a.iterator();
        while (it.hasNext()) {
            Map.Entry<VCardProperty, List<ValidationWarning>> next = it.next();
            VCardProperty key = next.getKey();
            for (ValidationWarning validationWarning : next.getValue()) {
                if (key != null) {
                    sb.append('[');
                    sb.append(key.getClass().getSimpleName());
                    sb.append("] | ");
                }
                Integer a2 = validationWarning.a();
                if (a2 != null) {
                    sb.append('W');
                    sb.append(integerInstance.format(a2));
                    sb.append(": ");
                }
                sb.append(validationWarning.b());
                sb.append(h.f5631a);
            }
        }
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<VCardProperty, List<ValidationWarning>>> iterator() {
        return this.f5520a.iterator();
    }
}
