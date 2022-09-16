package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aixq  reason: default package */
/* loaded from: classes.dex */
public final class aixq implements aixo {
    private static final Pattern a = Pattern.compile("X-TIMESTAMP-MAP=LOCAL:\\S+,MPEGTS:(\\d+)", 2);
    private final zdt b;

    public aixq(zdt zdtVar) {
        this.b = zdtVar;
    }

    @Override // defpackage.aixo
    public final void a(aixr aixrVar, pwu pwuVar, long j, int i) {
        aixr aixrVar2;
        int i2;
        pul pulVar;
        long j2;
        aixr aixrVar3 = aixrVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
        } catch (pjq unused) {
            aixrVar2 = aixrVar3;
        }
        try {
            if (!"WEBVTT".equals(pwuVar.s())) {
                throw pjq.a("Missing WEBVTT header", null);
            }
            String s = pwuVar.s();
            long j3 = 0;
            while (true) {
                if (s != null && s.isEmpty()) {
                    break;
                }
                aixr aixrVar4 = aixrVar3;
                if (s != null && s.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = a.matcher(s);
                    String group = matcher.matches() ? matcher.group(1) : null;
                    double parseLong = group != null ? Long.parseLong(group) : 0L;
                    Double.isNaN(parseLong);
                    j3 = (long) (parseLong * 11.1111111d);
                }
                s = pwuVar.s();
                aixrVar3 = aixrVar4;
            }
            while (true) {
                pul d = puq.d(pwuVar, Collections.emptyList());
                if (d == null) {
                    break;
                }
                arrayList2.add(new pul(d.a, d.b + j3, d.c + j3));
            }
            aixrVar3.b(j3 / 1000);
            long size = arrayList2.size();
            int i3 = 0;
            pul pulVar2 = (pul) arrayList2.get(0);
            long j4 = pulVar2.b;
            ArrayList arrayList3 = new ArrayList();
            while (true) {
                long j5 = i3;
                if (j5 >= size) {
                    break;
                }
                long j6 = pulVar2.c;
                String valueOf = String.valueOf(pulVar2.a.b);
                long j7 = j6;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
                sb.append("");
                sb.append(valueOf);
                String sb2 = sb.toString();
                long j8 = (-1) + size;
                if (j5 < j8) {
                    int i4 = i3 + 1;
                    i2 = i3;
                    pulVar = pulVar2;
                    while (i4 < size) {
                        pul pulVar3 = (pul) arrayList2.get(i4);
                        j2 = j5;
                        long j9 = pulVar3.b;
                        if (j9 > j7) {
                            break;
                        }
                        if (j9 > j4) {
                            j7 = j9;
                        }
                        if (j9 <= j4 && pulVar3.c >= j7) {
                            String valueOf2 = String.valueOf(String.valueOf(sb2).concat("\n"));
                            String valueOf3 = String.valueOf(pulVar3.a.b);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                            sb3.append(valueOf2);
                            sb3.append(valueOf3);
                            sb2 = sb3.toString();
                        }
                        i4++;
                        j5 = j2;
                    }
                } else {
                    i2 = i3;
                    pulVar = pulVar2;
                }
                j2 = j5;
                String str = sb2;
                long j10 = j7;
                arrayList3.add(new SubtitleWindowSnapshot(0, TimeUnit.MICROSECONDS.toMillis(j4), str, str, SubtitleWindowSettings.a));
                arrayList.add(new aixw(TimeUnit.MICROSECONDS.toMillis(j4), TimeUnit.MICROSECONDS.toMillis(j10), arrayList3, this.b));
                if (j2 == j8) {
                    break;
                }
                arrayList3 = new ArrayList();
                j4 = j10;
                i3 = i2;
                pulVar2 = pulVar;
                while (j4 >= pulVar2.c) {
                    i3++;
                    if (i3 < size) {
                        pulVar2 = (pul) arrayList2.get(i3);
                        j4 = Math.max(j4, pulVar2.b);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                aixrVar.a(aixy.a(this.b, j));
            } else {
                aixrVar.a(arrayList);
            }
        } catch (pjq unused2) {
            aixrVar2.a(aixy.a(null, j));
        }
    }
}
