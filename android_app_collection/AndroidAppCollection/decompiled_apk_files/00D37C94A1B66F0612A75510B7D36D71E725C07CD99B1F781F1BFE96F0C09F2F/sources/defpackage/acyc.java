package defpackage;

import java.io.CharArrayWriter;
import org.json.JSONArray;
/* compiled from: PG */
/* renamed from: acyc  reason: default package */
/* loaded from: classes.dex */
public final class acyc {
    private static final String b = "acyc";
    public acyb a;
    private int c;
    private int f = 1;
    private final CharArrayWriter d = new CharArrayWriter();
    private final CharArrayWriter e = new CharArrayWriter();

    public static final void a(int i) {
        if (i != 404) {
            if (i != 200) {
                throw new acyw(i);
            }
            return;
        }
        throw new acyu();
    }

    public final void b(char[] cArr) {
        int i;
        int i2;
        adil a;
        int i3 = 0;
        int length = cArr.length;
        int i4 = 0;
        while (length != 0) {
            int i5 = this.f;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            int i7 = 1;
            if (i6 != 0) {
                if (i6 == 1) {
                    int i8 = this.c;
                    if (length >= i8) {
                        this.f = 1;
                    } else {
                        i8 = length;
                    }
                    this.e.write(cArr, i4, i8);
                    int i9 = this.c - i8;
                    this.c = i9;
                    if (i9 == 0) {
                        acyb acybVar = this.a;
                        if (acybVar != null) {
                            String charArrayWriter = this.e.toString();
                            try {
                                String valueOf = String.valueOf(charArrayWriter);
                                if (valueOf.length() != 0) {
                                    "Received chunk:".concat(valueOf);
                                }
                                JSONArray jSONArray = new JSONArray(charArrayWriter);
                                int i10 = 0;
                                while (i10 < jSONArray.length()) {
                                    JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                                    int i11 = jSONArray2.getInt(i3);
                                    ((acyo) ((acyr) acybVar).b).h = i11;
                                    JSONArray jSONArray3 = jSONArray2.getJSONArray(i7);
                                    if (jSONArray3.length() > 0) {
                                        if (i11 == 0) {
                                            ((acyo) ((acyr) acybVar).b).g = jSONArray3.getString(i7);
                                        } else if (i11 == i7) {
                                            ((acyo) ((acyr) acybVar).b).i = jSONArray3.getString(i7);
                                        } else if (i11 > i7) {
                                            acyg acygVar = ((acyr) acybVar).c;
                                            if (jSONArray3.length() != 0 && (a = adil.a(jSONArray3.getString(i3))) != null) {
                                                acygVar.a.b.d(new adaf(a, "cloud_bc"));
                                                acvh acvhVar = acygVar.a.s;
                                                asny asnyVar = asny.LATENCY_ACTION_MDX_COMMAND;
                                                aopa createBuilder = asno.a.createBuilder();
                                                aopa createBuilder2 = asnt.a.createBuilder();
                                                createBuilder2.copyOnWrite();
                                                asnt asntVar = (asnt) createBuilder2.instance;
                                                i2 = i8;
                                                try {
                                                    asntVar.f = 1;
                                                    asntVar.b |= 8;
                                                    String str = a.al;
                                                    createBuilder2.copyOnWrite();
                                                    asnt asntVar2 = (asnt) createBuilder2.instance;
                                                    str.getClass();
                                                    asntVar2.b |= 2;
                                                    asntVar2.d = str;
                                                    asnt asntVar3 = (asnt) createBuilder2.mo39build();
                                                    createBuilder.copyOnWrite();
                                                    asno asnoVar = (asno) createBuilder.instance;
                                                    asntVar3.getClass();
                                                    asnoVar.w = asntVar3;
                                                    asnoVar.c |= 1048576;
                                                    acvhVar.n(asnyVar, (asno) createBuilder.mo39build());
                                                    acygVar.a.s.u("mdx_cr", asny.LATENCY_ACTION_MDX_COMMAND);
                                                    adss adssVar = acygVar.a.h;
                                                    if (adssVar == null) {
                                                        zep.m(acyi.a, "message received but channelMessageListener is null.");
                                                    } else {
                                                        adssVar.b(adtd.b(jSONArray3));
                                                    }
                                                    i10++;
                                                    i8 = i2;
                                                    i3 = 0;
                                                    i7 = 1;
                                                } catch (Exception e) {
                                                    e = e;
                                                    zep.f(acyr.a, "Chunk stream error", e);
                                                    this.e.reset();
                                                    i = i2;
                                                    i4 += i;
                                                    length -= i;
                                                    i3 = 0;
                                                }
                                            }
                                        }
                                    }
                                    i2 = i8;
                                    i10++;
                                    i8 = i2;
                                    i3 = 0;
                                    i7 = 1;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i2 = i8;
                            }
                        }
                        i2 = i8;
                        this.e.reset();
                    } else {
                        i2 = i8;
                    }
                    i = i2;
                }
                i = length;
            } else {
                for (int i12 = 0; i12 < length; i12++) {
                    if (cArr[i4 + i12] == '\n') {
                        this.d.write(cArr, i4, i12);
                        String charArrayWriter2 = this.d.toString();
                        try {
                            this.c = Integer.parseInt(charArrayWriter2, 10);
                            this.f = 2;
                            this.d.reset();
                        } catch (NumberFormatException e3) {
                            String str2 = b;
                            String valueOf2 = String.valueOf(charArrayWriter2);
                            zep.f(str2, valueOf2.length() != 0 ? "Error parsing chunk length: ".concat(valueOf2) : new String("Error parsing chunk length: "), e3);
                            this.f = 1;
                            this.d.reset();
                        }
                        i = i12 + 1;
                        break;
                    }
                }
                this.d.write(cArr, i4, length);
                i = length;
            }
            i4 += i;
            length -= i;
            i3 = 0;
        }
    }

    protected final void finalize() {
        if (this.f == 2) {
            zep.m(b, "Lost partial chunk");
        }
    }
}
