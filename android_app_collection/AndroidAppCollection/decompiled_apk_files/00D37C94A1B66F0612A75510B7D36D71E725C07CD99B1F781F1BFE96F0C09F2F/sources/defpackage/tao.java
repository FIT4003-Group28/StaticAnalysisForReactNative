package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import io.grpc.Status;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: tao  reason: default package */
/* loaded from: classes4.dex */
final class tao implements tfg {
    final /* synthetic */ tap a;
    private final byte[] b;
    private final byte[] c;
    private final String d;

    public tao(tap tapVar, byte[] bArr, aodt aodtVar, String str) {
        byte[] bArr2;
        this.a = tapVar;
        this.b = bArr;
        if (aodtVar != null) {
            aodt aodtVar2 = new aodt();
            int i = 0;
            while (true) {
                if (i >= aodtVar.W()) {
                    bArr2 = tea.a;
                    break;
                }
                aodtVar.aA(aodtVar2, i);
                if (aodtVar2.T() == 224886694) {
                    byte[] bArr3 = new byte[aodtVar2.S()];
                    aodtVar2.V().get(bArr3);
                    bArr2 = bArr3;
                    break;
                }
                i++;
            }
        } else {
            bArr2 = tea.a;
        }
        this.c = bArr2;
        this.d = str;
    }

    @Override // defpackage.tfg
    public final aodt a(tet tetVar, tff tffVar, tda tdaVar) {
        int i;
        byte[] bArr;
        int i2;
        tao taoVar;
        try {
            aodt aodtVar = new aodt();
            axmk axmkVar = this.a.c ? new axmk() : null;
            awrg f = ((tdc) this.a.e.get()).b() ? tbs.f(tdaVar) : null;
            if (f != null) {
                awrm a = awrn.a();
                a.copyOnWrite();
                ((awrn) a.instance).e(f);
                String a2 = tap.a(this.b);
                a.copyOnWrite();
                ((awrn) a.instance).f(a2);
                awro a3 = awrp.a();
                aorw e = tbs.e();
                a3.copyOnWrite();
                ((awrp) a3.instance).p(e);
                a3.copyOnWrite();
                ((awrp) a3.instance).o((awrn) a.mo39build());
                ((DebuggerClient) this.a.d.get()).sendTimelineEvent(((awrp) a3.mo39build()).toByteArray());
            }
            StringBuilder sb = new StringBuilder();
            ByteBuffer b = tap.b(this.a.b, tetVar);
            UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) this.a.a.get();
            byte[] bArr2 = this.b;
            byte[] array = b.array();
            int arrayOffset = b.arrayOffset() + b.position();
            int remaining = b.remaining();
            byte[] bArr3 = this.c;
            String str = this.d;
            try {
                if (bArr2 == null) {
                    throw new IllegalArgumentException("Attempt to resolve a null TemplateConfig");
                }
                byte[][] bArr4 = {null, null, null};
                long[] jArr = axmkVar != null ? new long[1] : null;
                if (array == null) {
                    bArr = UnifiedTemplateResolver.a;
                    i2 = 0;
                    i = 0;
                } else {
                    i = remaining;
                    bArr = array;
                    i2 = arrayOffset;
                }
                try {
                    Status jni_resolveFlat = unifiedTemplateResolver.jni_resolveFlat(bArr2, bArr, i2, i, bArr3, str, unifiedTemplateResolver.b, unifiedTemplateResolver.c, bArr4, jArr);
                    if (jni_resolveFlat.f()) {
                        aodt.aF(ByteBuffer.wrap(bArr4[0]), aodtVar);
                        byte[] bArr5 = bArr4[2];
                        if (bArr5 != null) {
                            String str2 = new String(bArr5);
                            sb.append(str2);
                            if (axmkVar != null) {
                                axmkVar.b = str2;
                            }
                        }
                        if (axmkVar != null) {
                            long j = jArr[0];
                            if (j > 0) {
                                axmkVar.a = j;
                            }
                        }
                    }
                    if (jni_resolveFlat.f()) {
                        StringBuilder sb2 = tdaVar.m;
                        if (sb2 != null) {
                            sb2.append((CharSequence) sb);
                            sb2.append('|');
                        }
                        if (axmkVar != null) {
                            long j2 = axmkVar.a;
                            if (j2 > 0) {
                                tffVar.f(j2);
                            }
                            String str3 = axmkVar.b;
                            if (str3 != null) {
                                tffVar.g(str3);
                            }
                        }
                    }
                    if (f == null || tdaVar.s == null) {
                        taoVar = this;
                    } else {
                        awrk a4 = awrl.a();
                        a4.copyOnWrite();
                        ((awrl) a4.instance).e(f);
                        awqm k = tbs.k(aodtVar, null, null, tdaVar.s);
                        if (k != null) {
                            a4.copyOnWrite();
                            ((awrl) a4.instance).f(k);
                        }
                        taoVar = this;
                        awro a5 = awrp.a();
                        aorw e2 = tbs.e();
                        a5.copyOnWrite();
                        ((awrp) a5.instance).p(e2);
                        a5.copyOnWrite();
                        ((awrp) a5.instance).n((awrl) a4.mo39build());
                        ((DebuggerClient) taoVar.a.d.get()).sendTimelineEvent(((awrp) a5.mo39build()).toByteArray());
                    }
                    if (jni_resolveFlat.f()) {
                        return aodtVar;
                    }
                    String valueOf = String.valueOf(jni_resolveFlat.getCode());
                    String a6 = tap.a(taoVar.b);
                    String description = jni_resolveFlat.getDescription();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(a6).length() + String.valueOf(description).length());
                    sb3.append("UnifiedTemplateResolver returned error ");
                    sb3.append(valueOf);
                    sb3.append(", ");
                    sb3.append(a6);
                    sb3.append(": ");
                    sb3.append(description);
                    throw new ted(sb3.toString());
                } catch (IOException e3) {
                    e = e3;
                    throw new ted("Error resolving template with UnifiedTemplateResolver", e);
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
