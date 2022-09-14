package ezvcard.property;

import java.util.Date;
/* loaded from: classes.dex */
public class Revision extends SimpleProperty<Date> {
    public Revision(Date date) {
        super(date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Revision(Revision revision) {
        super((SimpleProperty) revision);
        this.value = revision.value == 0 ? 0 : new Date(((Date) revision.value).getTime());
    }

    public static Revision now() {
        return new Revision(new Date());
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Revision mo226copy() {
        return new Revision(this);
    }
}
