package ezvcard.property;

import java.util.UUID;
/* loaded from: classes.dex */
public class Uid extends UriProperty {
    public Uid(String str) {
        super(str);
    }

    public Uid(Uid uid) {
        super(uid);
    }

    public static Uid random() {
        String uuid = UUID.randomUUID().toString();
        return new Uid("urn:uuid:" + uuid);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Uid mo226copy() {
        return new Uid(this);
    }
}
