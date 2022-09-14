package ezvcard.a.b;

import com.b.a.a.b.e;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
/* compiled from: AddressScribe.java */
/* loaded from: classes.dex */
public class a extends bg<Address> {
    public a() {
        super(Address.class, "ADR");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Address b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        if (cVar.a() == VCardVersion.V2_1) {
            return a(new e.a(str));
        }
        return a(new e.b(str));
    }

    private static Address a(e.b bVar) {
        Address address = new Address();
        address.getPoBoxes().addAll(bVar.b());
        address.getExtendedAddresses().addAll(bVar.b());
        address.getStreetAddresses().addAll(bVar.b());
        address.getLocalities().addAll(bVar.b());
        address.getRegions().addAll(bVar.b());
        address.getPostalCodes().addAll(bVar.b());
        address.getCountries().addAll(bVar.b());
        return address;
    }

    private static Address a(e.a aVar) {
        Address address = new Address();
        String a2 = aVar.a();
        if (a2 != null) {
            address.getPoBoxes().add(a2);
        }
        String a3 = aVar.a();
        if (a3 != null) {
            address.getExtendedAddresses().add(a3);
        }
        String a4 = aVar.a();
        if (a4 != null) {
            address.getStreetAddresses().add(a4);
        }
        String a5 = aVar.a();
        if (a5 != null) {
            address.getLocalities().add(a5);
        }
        String a6 = aVar.a();
        if (a6 != null) {
            address.getRegions().add(a6);
        }
        String a7 = aVar.a();
        if (a7 != null) {
            address.getPostalCodes().add(a7);
        }
        String a8 = aVar.a();
        if (a8 != null) {
            address.getCountries().add(a8);
        }
        return address;
    }
}
