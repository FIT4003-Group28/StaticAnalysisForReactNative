package defpackage;

import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: aluq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aluq implements alur {
    public final /* synthetic */ alus a;
    private final /* synthetic */ int b;

    public /* synthetic */ aluq(alus alusVar) {
        this.a = alusVar;
    }

    public /* synthetic */ aluq(alus alusVar, int i) {
        this.b = i;
        this.a = alusVar;
    }

    @Override // defpackage.alur
    public final void a() {
        int i = this.b;
        if (i == 0) {
            alus alusVar = this.a;
            for (int i2 = 0; i2 < alusVar.a.getAttributeCount(); i2++) {
                if ("defaultErrorCode".equals(alusVar.a.getAttributeName(i2))) {
                    alusVar.b.a = Integer.valueOf(aluc.a(alusVar.a.getAttributeValue(i2)));
                }
            }
            alusVar.b("split-install-error", new aluq(alusVar, 2));
        } else if (i != 1) {
            alus alusVar2 = this.a;
            String str = null;
            String str2 = null;
            for (int i3 = 0; i3 < alusVar2.a.getAttributeCount(); i3++) {
                if ("module".equals(alusVar2.a.getAttributeName(i3))) {
                    str = alusVar2.a.getAttributeValue(i3);
                }
                if ("errorCode".equals(alusVar2.a.getAttributeName(i3))) {
                    str2 = alusVar2.a.getAttributeValue(i3);
                }
            }
            if (str == null || str2 == null) {
                throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), alusVar2.a, null);
            }
            alusVar2.b.b().put(str, Integer.valueOf(aluc.a(str2)));
            do {
            } while (alusVar2.a.next() != 3);
        } else {
            alus alusVar3 = this.a;
            alusVar3.b("split-install-errors", new aluq(alusVar3));
        }
    }
}
