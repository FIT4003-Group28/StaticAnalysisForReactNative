package defpackage;
/* compiled from: PG */
/* renamed from: aktl  reason: default package */
/* loaded from: classes.dex */
public final class aktl implements var {
    public final yni a;
    public final akwr b;
    public final azpm c = azpm.e();

    public aktl(yni yniVar, akwr akwrVar) {
        this.a = yniVar;
        this.b = akwrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14, types: [aveo] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.var
    public final void a(baax baaxVar) {
        aveo aveoVar;
        String str = baaxVar.e;
        String str2 = 0;
        if (str != null) {
            String[] split = str.split(",");
            int length = split.length;
            String str3 = null;
            int i = 0;
            while (i < length) {
                String str4 = split[i];
                if (str4.length() > 0) {
                    String[] split2 = str4.split(":");
                    if (split2.length == 2) {
                        if ("pcen".equals(split2[0])) {
                            str3 = split2[1];
                        } else if ("tag".equals(split2[0])) {
                            str2 = aveo.b(Integer.parseInt(split2[1]));
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 57);
                        sb.append("Expected a colon-separated key-value pair when parsing '");
                        sb.append(str4);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
                str2 = str2;
            }
            aveoVar = str2;
            str2 = str3;
        } else {
            aveoVar = null;
        }
        akwo akwoVar = new akwo(str2, aveoVar);
        String str5 = akwoVar.a;
        aopa mo52toBuilder = baaxVar.mo52toBuilder();
        if (str5 == null) {
            mo52toBuilder.copyOnWrite();
            baax baaxVar2 = (baax) mo52toBuilder.instance;
            baaxVar2.b &= -5;
            baaxVar2.e = baax.a.e;
        } else {
            mo52toBuilder.copyOnWrite();
            baax baaxVar3 = (baax) mo52toBuilder.instance;
            baaxVar3.b |= 4;
            baaxVar3.e = str5;
        }
        new vav(this, akwoVar).a((baax) mo52toBuilder.mo39build());
    }
}
