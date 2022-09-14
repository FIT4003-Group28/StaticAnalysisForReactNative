package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
@c(a = {VCardVersion.V3_0, VCardVersion.V4_0})
/* loaded from: classes.dex */
public class ProductId extends TextProperty {
    public ProductId(String str) {
        super(str);
    }

    public ProductId(ProductId productId) {
        super(productId);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public ProductId mo226copy() {
        return new ProductId(this);
    }
}
