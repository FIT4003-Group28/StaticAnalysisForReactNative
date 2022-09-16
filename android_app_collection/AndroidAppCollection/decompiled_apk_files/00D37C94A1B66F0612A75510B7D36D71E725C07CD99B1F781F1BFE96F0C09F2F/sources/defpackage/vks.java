package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* compiled from: PG */
/* renamed from: vks  reason: default package */
/* loaded from: classes4.dex */
public final class vks {
    static {
        aopa createBuilder = awxr.a.createBuilder();
        awxm awxmVar = awxm.a;
        createBuilder.copyOnWrite();
        awxr awxrVar = (awxr) createBuilder.instance;
        awxmVar.getClass();
        awxrVar.c = awxmVar;
        awxrVar.b = 1;
        awxr awxrVar2 = (awxr) createBuilder.mo39build();
        aopa createBuilder2 = awxr.a.createBuilder();
        awxp awxpVar = awxp.a;
        createBuilder2.copyOnWrite();
        awxr awxrVar3 = (awxr) createBuilder2.instance;
        awxpVar.getClass();
        awxrVar3.c = awxpVar;
        awxrVar3.b = 2;
        awxr awxrVar4 = (awxr) createBuilder2.mo39build();
        aopa createBuilder3 = awxr.a.createBuilder();
        awxq awxqVar = awxq.a;
        createBuilder3.copyOnWrite();
        awxr awxrVar5 = (awxr) createBuilder3.instance;
        awxqVar.getClass();
        awxrVar5.c = awxqVar;
        awxrVar5.b = 3;
        awxr awxrVar6 = (awxr) createBuilder3.mo39build();
    }

    public static String a(awxs awxsVar) {
        String str;
        awxp awxpVar;
        awxq awxqVar;
        awxt awxtVar;
        awxo awxoVar;
        String str2;
        amuf f = amuk.f();
        for (awxr awxrVar : awxsVar.b) {
            int i = awxrVar.b;
            boolean z = false;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    str = "compress";
                } else if (i3 == 1) {
                    if (i == 2) {
                        awxpVar = (awxp) awxrVar.c;
                    } else {
                        awxpVar = awxp.a;
                    }
                    if (awxpVar.b == 1) {
                        String b = b((String) awxpVar.c);
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 21);
                        sb.append("encrypt(aes_gcm_key=");
                        sb.append(b);
                        sb.append(")");
                        str = sb.toString();
                    } else {
                        str = "encrypt";
                    }
                } else if (i3 == 2) {
                    if (i == 3) {
                        awxqVar = (awxq) awxrVar.c;
                    } else {
                        awxqVar = awxq.a;
                    }
                    if (awxqVar.b == 1) {
                        String b2 = b((String) awxqVar.c);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 18);
                        sb2.append("integrity(sha256=");
                        sb2.append(b2);
                        sb2.append(")");
                        str = sb2.toString();
                    } else {
                        str = "integrity";
                    }
                } else if (i3 == 3) {
                    if (i == 4) {
                        awxtVar = (awxt) awxrVar.c;
                    } else {
                        awxtVar = awxt.a;
                    }
                    if (1 == (awxtVar.b & 1)) {
                        z = true;
                    }
                    aqxo.p(z);
                    String b3 = b(awxtVar.c);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b3).length() + 12);
                    sb3.append("zip(target=");
                    sb3.append(b3);
                    sb3.append(")");
                    str = sb3.toString();
                } else if (i3 == 4) {
                    if (i == 5) {
                        awxoVar = (awxo) awxrVar.c;
                    } else {
                        awxoVar = awxo.a;
                    }
                    if (awxoVar.c.size() > 0) {
                        amuf f2 = amuk.f();
                        for (awxn awxnVar : awxoVar.c) {
                            aqxo.p(1 == (awxnVar.b & 1));
                            if ((awxnVar.b & 2) == 0) {
                                f2.h(awxnVar.c);
                            } else {
                                String str3 = awxnVar.c;
                                String b4 = b(awxnVar.d);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(b4).length());
                                sb4.append(str3);
                                sb4.append("=");
                                sb4.append(b4);
                                f2.h(sb4.toString());
                            }
                        }
                        String d = ampm.b(",").d(f2.g());
                        StringBuilder sb5 = new StringBuilder(String.valueOf(d).length() + 2);
                        sb5.append("(");
                        sb5.append(d);
                        sb5.append(")");
                        str2 = sb5.toString();
                    } else {
                        str2 = "";
                    }
                    String valueOf = String.valueOf(awxoVar.b);
                    String valueOf2 = String.valueOf(str2);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    throw new IllegalArgumentException("No transform specified");
                }
                f.h(str);
            } else {
                throw null;
            }
        }
        return vkc.b(f.g());
    }

    private static final String b(String str) {
        try {
            return URLEncoder.encode(str, vjz.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
