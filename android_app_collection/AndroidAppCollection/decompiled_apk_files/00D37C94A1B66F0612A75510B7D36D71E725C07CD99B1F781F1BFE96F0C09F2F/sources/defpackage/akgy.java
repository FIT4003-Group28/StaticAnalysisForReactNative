package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: akgy  reason: default package */
/* loaded from: classes.dex */
public final class akgy implements akhx {
    private static final int[] a = {271};
    private static final Pattern b = Pattern.compile("^\\s+");
    private static final Pattern c = Pattern.compile("\\s{2,}");
    private final akgt d;
    private final akgx e;

    public akgy(akgt akgtVar, akgx akgxVar) {
        akgtVar.getClass();
        this.d = akgtVar;
        akgxVar.getClass();
        this.e = akgxVar;
    }

    @Override // defpackage.akhx
    public final akhe a(akhr akhrVar) {
        ampq i;
        awxv awxvVar;
        awxv awxvVar2;
        int i2;
        akgx akgxVar = this.e;
        akgxVar.b();
        synchronized (akgxVar) {
            i = ampq.i(akgxVar.c);
        }
        if (!i.h()) {
            akhe.a.f = apwt.s(akhrVar);
            return akhe.a;
        }
        ampq h = this.d.h();
        Locale locale = akhrVar.b.isEmpty() ? Locale.ENGLISH : new Locale(akhrVar.b);
        if (!h.h() || !locale.getLanguage().equals(new Locale((String) h.c()).getLanguage())) {
            akhe.a.f = apwt.s(akhrVar);
            return akhe.a;
        }
        awxw awxwVar = (awxw) i.c();
        String lowerCase = c.matcher(b.matcher(akhrVar.d).replaceAll("")).replaceAll(" ").toLowerCase(locale);
        ArrayList<String> arrayList = new ArrayList();
        if (!lowerCase.isEmpty()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(awxwVar.a, "r");
                int i3 = 2;
                String str = null;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < lowerCase.length()) {
                    if (i5 == 0) {
                        randomAccessFile.seek(i3);
                        if ((awxw.c(awxwVar.c.b, randomAccessFile) & 1) == 1) {
                            randomAccessFile.skipBytes(awxwVar.c.b);
                        }
                        i5 = 0;
                        while (true) {
                            str = awxw.b(randomAccessFile);
                            if (str == null) {
                                str = null;
                                break;
                            }
                            int c2 = awxw.c(1, randomAccessFile);
                            int i7 = (c2 & 1) ^ 1;
                            if (i7 == 0) {
                                i3 = ((awxw.c(awxwVar.c.a - 1, randomAccessFile) << 8) | c2) >>> 1;
                            } else {
                                i6 = (c2 | (awxw.c(awxwVar.c.b - 1, randomAccessFile) << 8)) >>> 1;
                            }
                            if (lowerCase.codePointAt(i4) == str.codePointAt(0)) {
                                i5 = i7;
                                break;
                            }
                            i5 = i7;
                        }
                        if (str != null && (lowerCase.substring(i4).startsWith(str) || str.startsWith(lowerCase.substring(i4)))) {
                            i4 += str.length();
                        }
                    }
                    awxvVar = null;
                }
                awxvVar = new awxv();
                String substring = str.substring(str.length() - (i4 - lowerCase.length()));
                String valueOf = String.valueOf(lowerCase);
                String valueOf2 = String.valueOf(substring);
                awxvVar.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                awxvVar.b = 1 == i5;
                awxvVar.d = i3;
                if (i5 == 0) {
                    randomAccessFile.seek(i3);
                    awxvVar.c = awxw.c(awxwVar.c.b, randomAccessFile) >>> 1;
                } else {
                    awxvVar.c = i6;
                }
                if (!substring.isEmpty()) {
                    substring.codePointAt(0);
                }
                if (awxvVar != null) {
                    ArrayList<awxv> arrayList2 = new ArrayList();
                    arrayList2.add(awxvVar);
                    while (true) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList2.size()) {
                                awxvVar2 = null;
                                i2 = 0;
                                break;
                            } else if (!((awxv) arrayList2.get(i8)).b) {
                                awxvVar2 = (awxv) arrayList2.get(i8);
                                arrayList2.remove(i8);
                                i2 = awxwVar.b - i8;
                                break;
                            } else {
                                i8++;
                            }
                        }
                        if (awxvVar2 == null) {
                            break;
                        }
                        randomAccessFile.seek(awxvVar2.d);
                        if ((awxw.c(awxwVar.c.b, randomAccessFile) & 1) == 1) {
                            awxv awxvVar3 = new awxv();
                            awxvVar3.a = awxvVar2.a;
                            awxvVar3.c = awxw.c(awxwVar.c.b, randomAccessFile);
                            awxvVar3.b = true;
                            awxwVar.a(arrayList2, awxvVar3);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        while (i2 > 0) {
                            String b2 = awxw.b(randomAccessFile);
                            if (b2 == null) {
                                break;
                            }
                            awxv awxvVar4 = new awxv();
                            String valueOf3 = String.valueOf(awxvVar2.a);
                            awxvVar4.a = b2.length() != 0 ? valueOf3.concat(b2) : new String(valueOf3);
                            int c3 = awxw.c(1, randomAccessFile);
                            int i9 = (c3 & 1) ^ 1;
                            if (i9 != 0) {
                                awxvVar4.c = (c3 | (awxw.c(awxwVar.c.b - 1, randomAccessFile) << 8)) >>> 1;
                            } else {
                                awxvVar4.d = (c3 | (awxw.c(awxwVar.c.a - 1, randomAccessFile) << 8)) >>> 1;
                            }
                            awxvVar4.b = 1 == i9;
                            arrayList3.add(awxvVar4);
                            i2--;
                        }
                        int size = arrayList3.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            awxv awxvVar5 = (awxv) arrayList3.get(i10);
                            if (!awxvVar5.b) {
                                randomAccessFile.seek(awxvVar5.d);
                                awxvVar5.c = awxw.c(awxwVar.c.b, randomAccessFile) >>> 1;
                            }
                            awxwVar.a(arrayList2, awxvVar5);
                        }
                    }
                    for (awxv awxvVar6 : arrayList2) {
                        arrayList.add(awxvVar6.a);
                    }
                }
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (String str2 : arrayList) {
            arrayList4.add(new akhl(str2, 23, a));
        }
        akhe akheVar = new akhe(arrayList4, this.d.m(), this.d.c());
        akheVar.f = apwt.s(akhrVar);
        return akheVar;
    }
}
