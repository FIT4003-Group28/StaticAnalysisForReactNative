package defpackage;

import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
/* compiled from: PG */
/* renamed from: clxm  reason: default package */
/* loaded from: classes5.dex */
final class clxm {
    static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int b = 0;

    public static TextInformationFrame a(int i, String str, cmnk cmnkVar) {
        int r = cmnkVar.r();
        if (cmnkVar.r() == 1684108385) {
            cmnkVar.h(8);
            return new TextInformationFrame(str, null, cmnkVar.A(r - 16));
        }
        if (String.valueOf(clwz.g(i)).length() == 0) {
            new String("Failed to parse text attribute: ");
        }
        return null;
    }

    public static Id3Frame b(int i, String str, cmnk cmnkVar, boolean z, boolean z2) {
        int d = d(cmnkVar);
        if (z2) {
            d = Math.min(1, d);
        }
        if (d >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, Integer.toString(d));
            }
            return new CommentFrame("und", str, Integer.toString(d));
        }
        if (String.valueOf(clwz.g(i)).length() == 0) {
            new String("Failed to parse uint8 attribute: ");
        }
        return null;
    }

    public static TextInformationFrame c(int i, String str, cmnk cmnkVar) {
        int r = cmnkVar.r();
        if (cmnkVar.r() == 1684108385 && r >= 22) {
            cmnkVar.h(10);
            int m = cmnkVar.m();
            if (m > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(m);
                String sb2 = sb.toString();
                int m2 = cmnkVar.m();
                if (m2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(m2);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, null, sb2);
            }
        }
        if (String.valueOf(clwz.g(i)).length() == 0) {
            new String("Failed to parse index/count attribute: ");
        }
        return null;
    }

    public static int d(cmnk cmnkVar) {
        cmnkVar.h(4);
        if (cmnkVar.r() == 1684108385) {
            cmnkVar.h(8);
            return cmnkVar.l();
        }
        return -1;
    }
}
