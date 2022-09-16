package ezvcard.a.b;

import com.b.a.a.b.e;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.ClientPidMap;
/* compiled from: ClientPidMapScribe.java */
/* loaded from: classes.dex */
public class k extends bg<ClientPidMap> {
    public k() {
        super(ClientPidMap.class, "CLIENTPIDMAP");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public ClientPidMap b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        e.a aVar = new e.a(str, 2);
        String a2 = aVar.a();
        String a3 = aVar.a();
        if (a2 == null || a3 == null) {
            throw new ezvcard.a.a(3, new Object[0]);
        }
        return a(a2, a3);
    }

    private ClientPidMap a(String str, String str2) {
        try {
            return new ClientPidMap(Integer.valueOf(Integer.parseInt(str)), str2);
        } catch (NumberFormatException unused) {
            throw new ezvcard.a.a(4, new Object[0]);
        }
    }
}
