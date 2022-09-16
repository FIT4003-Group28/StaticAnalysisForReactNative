package defpackage;

import com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: whx  reason: default package */
/* loaded from: classes4.dex */
public final class whx implements aasn {
    private final whw a;
    private final aafo b;
    private String c;
    private apzg d;
    private boolean e;

    public whx(whw whwVar, aafo aafoVar) {
        aafoVar.getClass();
        this.b = aafoVar;
        this.a = whwVar;
        this.e = false;
    }

    @Override // defpackage.aasn
    public final void a(cff cffVar) {
        zep.d("Request verification code failed.", cffVar);
        this.e = false;
        whw whwVar = this.a;
        if (whwVar != null) {
            whwVar.e();
        }
    }

    @Override // defpackage.aasn
    public final void b(asfz asfzVar) {
        this.e = false;
        if (this.a != null) {
            if (asfzVar.e.size() != 0 || (asfzVar.b & 2) != 0) {
                int i = 1;
                if (asfzVar.e.size() <= 0 || (((asfx) asfzVar.e.get(0)).b & 1) == 0) {
                    if (asfzVar.e.size() <= 0) {
                        apzg apzgVar = asfzVar.d;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        atvx atvxVar = ((PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint) apzgVar.qm(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.phoneVerificationCodeInputResultEndpoint)).b;
                        if (atvxVar == null) {
                            atvxVar = atvx.a;
                        }
                        if ((atvxVar.b & 1) == 0) {
                            zep.b("ValidateVerificationCodeResponse contains an unexpected null value.");
                            this.a.e();
                            return;
                        }
                        apzg apzgVar2 = asfzVar.d;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        atvx atvxVar2 = ((PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint) apzgVar2.qm(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.phoneVerificationCodeInputResultEndpoint)).b;
                        if (atvxVar2 == null) {
                            atvxVar2 = atvx.a;
                        }
                        atvz atvzVar = atvxVar2.c;
                        if (atvzVar == null) {
                            atvzVar = atvz.a;
                        }
                        int i2 = atvzVar.b;
                        if ((i2 & 1) != 0) {
                            whw whwVar = this.a;
                            atwa atwaVar = atvzVar.c;
                            if (atwaVar == null) {
                                atwaVar = atwa.a;
                            }
                            atwe atweVar = atwaVar.b;
                            if (atweVar == null) {
                                atweVar = atwe.a;
                            }
                            whwVar.d(atweVar);
                            return;
                        } else if ((i2 & 2) == 0) {
                            zep.b("ValidateVerificationCodeResponse contains an unexpected null value.");
                            this.a.e();
                            return;
                        } else {
                            whw whwVar2 = this.a;
                            atvy atvyVar = atvzVar.d;
                            if (atvyVar == null) {
                                atvyVar = atvy.a;
                            }
                            atvt atvtVar = atvyVar.b;
                            if (atvtVar == null) {
                                atvtVar = atvt.a;
                            }
                            whwVar2.g(atvtVar);
                            return;
                        }
                    }
                    atwo atwoVar = ((asfx) asfzVar.e.get(0)).c;
                    if (atwoVar == null) {
                        atwoVar = atwo.a;
                    }
                    int ae = akel.ae(atwoVar.b);
                    if (ae != 0) {
                        i = ae;
                    }
                    String num = Integer.toString(i - 1);
                    StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 65);
                    sb.append("ValidateVerificationCode failed with PhoneVerificationErrorType: ");
                    sb.append(num);
                    zep.b(sb.toString());
                    this.a.e();
                    return;
                }
                zep.b("ValidateVerificationCodeResponse contains an unexpected null value.");
                this.a.e();
                return;
            }
            zep.b("ValidateVerificationCodeResponse contains an unexpected null value.");
            this.a.e();
        }
    }

    public final void c(Long l, String str, apzg apzgVar) {
        if (this.e) {
            return;
        }
        long longValue = l.longValue();
        this.c = str;
        apzgVar.getClass();
        this.d = apzgVar;
        this.e = true;
        Long valueOf = Long.valueOf(longValue);
        String str2 = this.c;
        HashMap hashMap = new HashMap();
        hashMap.put("KEY_IDV_REQUEST_ID", valueOf);
        hashMap.put("KEY_VERIFICATION_CODE", str2);
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.b.c(this.d, hashMap);
    }
}
