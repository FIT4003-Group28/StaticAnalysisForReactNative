package c.d.d.k;

import c.d.d.d.i;
import java.io.InputStream;
/* loaded from: classes.dex */
public class d {
    public static long a(InputStream inputStream, long j) {
        i.a(inputStream);
        i.a(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
